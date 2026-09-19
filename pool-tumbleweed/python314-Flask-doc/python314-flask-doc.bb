SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "3.1.3"

RPM_NAME = "python314-Flask-doc-3.1.3-2.2.noarch.rpm"
RPM_HASH = "d565b3f1369a2f1e947e713d39bac0ce78d63a3e914346ef0e5ac2674e990cbb6c72a32b7ce5ff8b6bdb581f0104fc50668ad7f97c644404ff558f58b7f1adb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Flask-doc"

RDEPENDS:${PN} += "python314-Flask"

inherit rpm
