SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-pyvdr-0.3.1-2.5.noarch.rpm"
RPM_HASH = "b428d812e8e79e399404c7080d32ecbd705a954493d52c792db4bd0c84f00b551c0958058e704201b01acdc6641ecdc20823565c63712f73a5bd94102742c240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvdr \
python3.13dist-pyvdr \
python313-pyvdr \
python3dist-pyvdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
