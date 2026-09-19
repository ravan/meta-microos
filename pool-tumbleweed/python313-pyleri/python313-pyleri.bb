SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python313-pyleri-1.5.1-1.1.noarch.rpm"
RPM_HASH = "58af4a9996829cb0e96f2dc15adb0dadd42a55831f837ab02f4ac78d76e6cdf63836e1d741c1cae0729bc2ec65ad67b2610a8fe369a6d8d49aa22d4516154f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyleri \
python3.13dist-pyleri \
python313-pyleri \
python3dist-pyleri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
