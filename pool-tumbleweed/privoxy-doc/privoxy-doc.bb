SUMMARY = "The documentation of Privoxy"
DESCRIPTION = "Documentation files for the Privoxy: The Internet Junkbuster - HTTP \
Proxy Server. A non-caching HTTP proxy server that runs between a web \
browser and a web server and filters contents as described in the \
configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "privoxy-doc-4.2.0-1.3.noarch.rpm"
RPM_HASH = "0cb746e3bf4fe5509189025c6b7ec3b1d471e2a0f58917bd6f89f10e49ac54c32f1515c59be5ae509a6f9156cee23124ad643a309dacbd87cca4982a55151f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "privoxy-doc"

RDEPENDS:${PN} += "privoxy"

inherit rpm
