SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python313-GooseMPL-0.15.0-2.6.noarch.rpm"
RPM_HASH = "ad47941b06a7172b879ae481da08cefa3da81d06784245b10903ef0d836dfa9fec9742c79a67ce5c2fdb028b719e073a943afdfe22410c0622a3848d7c59db8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GooseMPL \
python3.13dist-goosempl \
python313-GooseMPL \
python3dist-goosempl"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-deprecation \
python313-matplotlib \
python313-matplotlib-latex \
python313-numpy \
python313-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm
