SUMMARY = "Documentation for libdbusmenu-glib4"
DESCRIPTION = "This package includes the documentation for the dbusmenu-glib library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib-doc-16.04.0-13.4.noarch.rpm"
RPM_HASH = "57e88275121a0497c7ce66fd30ef1232d8cef1cb3f493e83a6bef68cdc838ddaaced14a1bba43f1364e19f1df65196346bbd7014df82b2a33aa37c2a795fc8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbusmenu-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
