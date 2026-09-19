SUMMARY = "C Library API to the Flickr Web Service"
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

RPM_NAME = "libflickcurl0-1.26-6.5.aarch64.rpm"
RPM_HASH = "b3eab14ffbc4b3f866f43c039c50238aaf9b0abee53523c0dd36ee61750381c3a5c6a6675837c00585c095cc9bb99c80671db66f06f8b3f619b970037921442c"

RPROVIDES:${PN} += "libflickcurl.so.0 \
libflickcurl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libxml2.so.16"

inherit rpm
