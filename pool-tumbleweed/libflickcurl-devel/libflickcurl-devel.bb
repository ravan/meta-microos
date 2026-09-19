SUMMARY = "Development files for flickurl, a Flickr Web Service library"
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

RPM_NAME = "libflickcurl-devel-1.26-6.5.aarch64.rpm"
RPM_HASH = "4593a199c9936008a049f4f11ac443425a38b8ab3eb6300ebf0adab8699b3a2968925f596dbb70e8c8eb9aecf4e083a1d9e3d840a568e4fb8c91230a6acc236d"

RPROVIDES:${PN} += "libflickcurl-devel \
pkgconfig-flickcurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcurl-devel \
libflickcurl0 \
libraptor-devel \
pkgconfig-libxml-2.0 \
pkgconfig-raptor2"

inherit rpm
