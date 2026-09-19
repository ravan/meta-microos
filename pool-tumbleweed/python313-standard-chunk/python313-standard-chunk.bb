SUMMARY = "Standard library chunk redistribution. 'dead battery'"
DESCRIPTION = "Standard library chunk redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python313-standard-chunk-3.13.0-2.4.noarch.rpm"
RPM_HASH = "585f24825fe7a0af2f107a013c3587ea74caff428de3720581de58393e06224cc5850471488fbd25e016693c87d1f01a6a5da46bfbe3f64cdcc003231be15d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standard-chunk \
python3.13dist-standard-chunk \
python313-standard-chunk \
python3dist-standard-chunk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
