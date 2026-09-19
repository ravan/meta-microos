SUMMARY = "Module for converting between datetime.timedelta and Go's Duration strings"
DESCRIPTION = "Module for converting between datetime.timedelta and Go's Duration strings."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python313-durationpy-0.10-1.5.aarch64.rpm"
RPM_HASH = "55b193c16eaf03cf269ef68af0cc4535cebef32ed10084b1f88643ae2e20e8103493d7f1ef1723ad82242a65df545d234e3b87fd2665c3048c532856ae58d1d7"

RPROVIDES:${PN} += "python3-durationpy \
python3.13dist-durationpy \
python313-durationpy \
python3dist-durationpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
