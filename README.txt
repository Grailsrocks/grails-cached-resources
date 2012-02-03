
This plugin calculates SHA256 hashes of your static resources and renames them to include this hash.

It then sets long term caching headers on the resources when rendering them.

Builds on the "Resources" framework plugin 

Todos:

* Add "excludes" URIs via Config to prevent certain types and URIs being handled in this way - 
  e.g. sites with lots of photos or where a filename is important e.g. Catalogue-2010.pdf
  Allow closure to determine it at runtime. e.g.:

  cached.resources.excludes = [
	  '*.pdf',
	  'assets/',
	  { uri ->
	  	  return !uri.startsWith('catalogue')
	  }
  ]



