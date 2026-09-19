SUMMARY = "Command-Line Tools for the Flickr Web Service"
DESCRIPTION = "Flickcurl is a C library for calling the Flickr Web service API. It handles the \
API signing, token management, and parameter encoding and decoding, resulting \
in C functions for the Web services APIs. It... uses libcurl to call the REST \
Web service, and libxml2 to manipulate the XML responses. The library supports \
reading photo, tag, and comments information, the photo upload and searching \
APIs, and writing tags and comments. It provides utilities such as 'flickcurl' \
to exercise the API and 'flickrdf' to get RDF metadata descriptions out of \
photos, tags, and machine tags."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "flickcurl-1.26-6.5.aarch64.rpm"
RPM_HASH = "dfdac7228ae990fc17259f32320e01c487d6b1c0e96b7d005317590b1c6f4dc450c19afe0f16d94a107a8717aaaf7d031122bed7749cfa9d45147110cd680ee4"

RPROVIDES:${PN} += "flickcurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libflickcurl.so.0 \
libraptor2.so.0"

inherit rpm
