SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "python313-palettable-3.3.3-1.9.noarch.rpm"
RPM_HASH = "2c3c47e7e2b832b418143be90b29667192256a20a9c7ad95aa79695ddb187bbfa2960733451ed78aadcc09c2a060daa1f2becbd7eb83b8a409627aa57226dc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-palettable \
python3.13dist-palettable \
python313-palettable \
python3dist-palettable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
