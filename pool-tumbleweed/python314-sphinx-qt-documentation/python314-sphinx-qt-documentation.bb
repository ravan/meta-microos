SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python314-sphinx-qt-documentation-0.4.1-2.5.noarch.rpm"
RPM_HASH = "8cfe51a80675ca835999c705b0faafed65d013dce6ff781f8a1bb4acd1b20bf0b27a64b9380d49eab31af04989d77d549e1eaae6047619183dcf96ddccfd966f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-qt-documentation \
python314-sphinx-qt-documentation \
python3dist-sphinx-qt-documentation"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
