SUMMARY = "Documentation for texlive-changepage"
DESCRIPTION = "This package includes the documentation for texlive-changepage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn77682"

RPM_NAME = "texlive-changepage-doc-2026.226.1.0csvn77682-59.2.noarch.rpm"
RPM_HASH = "50217b46f7886dc7fc6977bde44eacaaaeb57a4de8faef740498959f33e0af05ad7824728f4ecf9e6dfac8f00135ce6adacf9701b1ccdf043c03fc8cf224c30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
