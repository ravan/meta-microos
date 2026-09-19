SUMMARY = "Python print elegant"
DESCRIPTION = "This module provides Python rendering functionality. It can render a \
dictionary such that it is displayed with indentations for \
illustration of hierarchy. It can center blocks of text for terminal \
output. It can render segment displays. It can render and display \
tables of various specified widths and column widths with various \
text wrapping features and delimiters. It can provide color palettes, \
extend them and save images of them."
LICENSE = "GPL-3.0-only"

PV = "2018.9.14.1501"

RPM_NAME = "python314-pyprel-2018.9.14.1501-5.5.noarch.rpm"
RPM_HASH = "500a0826a9d9a38138e10712f2e8eb32f2fa62e347ebdd135aa02d7f6c97f9b58be914a6835cddf54d2ed087abb6cd096bd930b0ebb232657ed4a279f604eb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyprel \
python314-pyprel \
python3dist-pyprel"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-numpy \
python314-pandas \
python314-pyfiglet \
python314-shijian"

inherit rpm
