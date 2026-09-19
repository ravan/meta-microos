SUMMARY = "Documentation for nghttp2"
DESCRIPTION = "Documentation for nghttp2, which includes a shared C library, \
HTTP/2 client, server and proxy."
LICENSE = "MIT"

PV = "1.70.0"

RPM_NAME = "nghttp2-doc-1.70.0-1.1.noarch.rpm"
RPM_HASH = "7aacb8d2255edd7cc3a1004696bf670a9ef6e05f0fa0f29fcc9d2bb009373d1f2777282048548039f786c585f70b25582b3019a53f5fde568661329cadabdd8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nghttp2-doc"

RDEPENDS:${PN} += ""

inherit rpm
