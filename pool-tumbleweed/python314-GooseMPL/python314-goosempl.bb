SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python314-GooseMPL-0.15.0-2.6.noarch.rpm"
RPM_HASH = "9ceb7e61cd667514a06949a9439918abb0e1d1b811a67932f2a09614f8f8c545296162758e7cc3f2c700a72d4d3d7124e989df2991c66ede1f6deb9f3f33de75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-goosempl \
python314-GooseMPL \
python3dist-goosempl"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-deprecation \
python314-matplotlib \
python314-matplotlib-latex \
python314-numpy \
python314-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm
