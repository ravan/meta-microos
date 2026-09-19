SUMMARY = "Documents of caja-actions"
DESCRIPTION = "This package provides help documents for caja-actions"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-actions-doc-1.28.0-1.10.noarch.rpm"
RPM_HASH = "130f53457d67ffff3643d306d75b1c67778e79206763f921af20013ec52040472750e1df68dd3d1961916920d85007f47731cf902aaff5a069daf0bcbc3cf418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-actions-doc"

RDEPENDS:${PN} += ""

inherit rpm
