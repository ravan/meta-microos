SUMMARY = "FDO Icon theme to go with Dark Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the Dark Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220216.1.26"

RPM_NAME = "openSUSE-e-X-Dark-Icons-20220216.1.26-2.2.noarch.rpm"
RPM_HASH = "f86cf6c23e0151610cc5f2ea0e40728a9629bc7f338ea18301eb76a14a8c59dd5e9d9c23bd011a7dca03dec0be3f6eb2773e252e446a58f88508d502382381df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Dark-Icons"

RDEPENDS:${PN} += ""

inherit rpm
