SUMMARY = "Standard library imghdr redistribution"
DESCRIPTION = "Standard library imghdr redistribution. 'dead battery'."
LICENSE = "PSF-2.0"

PV = "3.13.0"

RPM_NAME = "python314-standard-imghdr-3.13.0-1.5.noarch.rpm"
RPM_HASH = "5f2aae66c1e3b61e21a79c3fe5744dd160df677990c04b0c6c27ba179fe7f613a5234575dd96a25e35caf0c7b9b53cdef806d3090af8f606727622a0395f00e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-standard-imghdr \
python314-standard-imghdr \
python3dist-standard-imghdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
