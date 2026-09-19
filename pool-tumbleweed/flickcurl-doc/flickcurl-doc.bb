SUMMARY = "Documentation for flickcurl, a Flickr Web Service C library"
DESCRIPTION = "Flickcurl is a C library for calling the Flickr Web service API. It handles the \
API signing, token management, and parameter encoding and decoding, resulting \
in C functions for the Web services APIs. It... uses libcurl to call the REST \
Web service, and libxml2 to manipulate the XML responses. The library supports \
reading photo, tag, and comments information, the photo upload and searching \
APIs, and writing tags and comments. It provides utilities such as 'flickcurl' \
to exercise the API and 'flickrdf' to get RDF metadata descriptions out of \
photos, tags, and machine tags. \
 \
This subpackage contains the developer documentation for flickcurl."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "flickcurl-doc-1.26-6.5.aarch64.rpm"
RPM_HASH = "aceaa894bdf32dc36f18f83c68310434b0c1d335e95254da8635acd44a17476522ae56d270b549e382f9d1593594c9237ca688b929cb9b077591dca64ff31229"

RPROVIDES:${PN} += "flickcurl-doc"

RDEPENDS:${PN} += "libflickcurl0"

inherit rpm
