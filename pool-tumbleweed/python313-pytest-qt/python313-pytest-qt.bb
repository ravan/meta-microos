SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python313-pytest-qt-4.5.0-1.5.noarch.rpm"
RPM_HASH = "c9f2fcde3cad849b94dead760ef50d319a594adce1b2790e4eff8822381ee11c537d3c4f29bd990afb1519f816e71eadecd759b68e9f6758c5d8fbd7a1577e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-qt \
python3.13dist-pytest-qt \
python313-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python313-pytest \
python313-typing-extensions"

inherit rpm
