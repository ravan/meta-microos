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

RPM_NAME = "python314-pyxdg-0.28-6.1.noarch.rpm"
RPM_HASH = "1a2b670a579f988d9303ea117d33e1584d309e87de96b519c2bb992fc61c7106f2540cdb7b4872f4e5e115bb781ef303f28bf951cb9ea763e6a6514a8fa90e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyxdg \
python314-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
