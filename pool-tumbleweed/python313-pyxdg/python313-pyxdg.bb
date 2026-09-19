SUMMARY = "Implementations of freedesktop.org standards in python"
DESCRIPTION = "PyXDG is a python library to access freedesktop.org standards. Currently supported are: \
 * Base Directory Specification Version 0.6 \
 * Menu Specification Version 1.0 \
 * Desktop Entry Specification Version 1.0 \
 * Icon Theme Specification Version 0.8 \
 * Recent File Spec 0.2 \
 * Shared-MIME-Database Specification 0.13"
LICENSE = "LGPL-2.1-only"

PV = "0.28"

RPM_NAME = "python313-pyxdg-0.28-6.1.noarch.rpm"
RPM_HASH = "4ad69f16d5b724491fc9e04aace154dcc156ca6cf2af43d68ef2db585d4961048a1764b08a72fccbedb661e6266db46cc6ba256bec408d93bbd35f99d9bdba47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyxdg \
python3.13dist-pyxdg \
python313-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
