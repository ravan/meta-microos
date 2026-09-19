SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python313-sphinx-qt-documentation-0.4.1-2.5.noarch.rpm"
RPM_HASH = "5b385fa672946d4cf896d9eabc781170d6175a0927fed48dd1cebbf068046f8e2d87bd5d8c0c824fa3558e3b5458e4091f3e5f01e61c8c1f6d66338619014f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-qt-documentation \
python3.13dist-sphinx-qt-documentation \
python313-sphinx-qt-documentation \
python3dist-sphinx-qt-documentation"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
