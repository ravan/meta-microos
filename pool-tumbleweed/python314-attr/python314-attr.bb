SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python314-attr-0.3.2-3.5.noarch.rpm"
RPM_HASH = "9a7890ed321edd5deda6c87e039db19de311304b36a8ca8dea9655c816f0a199fea6ed627549becd02744b09908a736915af80100b10872ab936709424b3d01a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-attr \
python314-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
