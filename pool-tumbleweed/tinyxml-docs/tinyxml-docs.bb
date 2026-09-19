SUMMARY = "Documentaqtion for libtinyxml"
DESCRIPTION = "This packages contains the HTML documentation and a tutorial for \
libtinyxml"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "tinyxml-docs-2.6.2-14.5.noarch.rpm"
RPM_HASH = "c265127458249d2a2abe869c62e4228a04e8ed1268ae696710e0258a8ca86eda587b526ffa6ca7e2321e21a2dd9526fc677a71a6d7849e30469d2ea65c57f098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tinyxml-docs"

RDEPENDS:${PN} += "libtinyxml0"

inherit rpm
