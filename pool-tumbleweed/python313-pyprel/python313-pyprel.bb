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

RPM_NAME = "python313-pyprel-2018.9.14.1501-5.5.noarch.rpm"
RPM_HASH = "7ad05b5f9f9005df09a75eeafdea535bf53e1220fdaaa895c90cf6319329ab08a202f7a61ee48869fd9c7d023d49e6e17960348c850a34129bf1cc6d44d227ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyprel \
python3.13dist-pyprel \
python313-pyprel \
python3dist-pyprel"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-numpy \
python313-pandas \
python313-pyfiglet \
python313-shijian"

inherit rpm
