SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "python314-palettable-3.3.3-1.9.noarch.rpm"
RPM_HASH = "ddc6c8df49ad5c902295d0ee14164524774eb7236fc0fe0e430859d47cd595b6947dca8f163cb1579a2e99c32a00f23b3267b0c41abb6b4fde4a56e5b3700c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-palettable \
python314-palettable \
python3dist-palettable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
