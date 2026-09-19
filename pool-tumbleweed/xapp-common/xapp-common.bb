SUMMARY = "Common files for XApp desktop applications"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This package includes files that are shared between several XApp \
applications (i18n files and configuration schemas)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "3.2.2"

RPM_NAME = "xapp-common-3.2.2-1.4.noarch.rpm"
RPM_HASH = "87c1d49404d30f195752d238823bd8571f2fd4909124bdef6d7ee273b65cb17feab94c7804b6d2988b4d3b07dc66c127a2bf94c6322748bcd79537de1696e4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xapp-common \
xapps-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
typelib-XApp"

inherit rpm
