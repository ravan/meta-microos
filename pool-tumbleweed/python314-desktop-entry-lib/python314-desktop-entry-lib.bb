SUMMARY = "A library for working with .desktop files"
DESCRIPTION = "desktop-entry-lib allows reading and writing .desktop files according to the \
Desktop Entry Specification."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python314-desktop-entry-lib-5.0-3.2.noarch.rpm"
RPM_HASH = "237db274d8926754b217c1937b4ce9cc7d1afde9340728ba83b6c4eac92c5e26a64626e8356093058df98c284f7753442ce410c4e6f4d968ebfccd88d1e330f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-desktop-entry-lib \
python314-desktop-entry-lib \
python3dist-desktop-entry-lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
