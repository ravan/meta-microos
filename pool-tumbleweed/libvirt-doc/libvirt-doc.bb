SUMMARY = "API reference and website documentation"
DESCRIPTION = "Includes the API reference for the libvirt C library, and a complete \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-doc-12.7.0-1.1.noarch.rpm"
RPM_HASH = "c15db41a43252167f59cce26cfcf3dbc9e9619292d8d362037d72d52b959a69b03df0cc0c21edde2e2f72a1171a599a848fe57be1379d2bf44f98820804cbbb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
