SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python314-pytest-qt-4.5.0-1.5.noarch.rpm"
RPM_HASH = "22d29a85aebd21ddd9ff17eb0a94f814199cc54da6af323fb69fb00d3a0365a1d1f271e584e77e1f2176a20987ec56e5165dd4764e4d2941b8adae40a65f541c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-qt \
python314-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python314-pytest \
python314-typing-extensions"

inherit rpm
