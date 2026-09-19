SUMMARY = "Module for converting between datetime.timedelta and Go's Duration strings"
DESCRIPTION = "Module for converting between datetime.timedelta and Go's Duration strings."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python314-durationpy-0.10-1.5.aarch64.rpm"
RPM_HASH = "6347d81a8342e1ba6581fb0f6fca29d0571e5d07df2ab8f807041aaa959832395b2e48774e1f2bb757578cce10fd759ba07c90c6006ffa4daf4c8f2e5e331cee"

RPROVIDES:${PN} += "python3.14dist-durationpy \
python314-durationpy \
python3dist-durationpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
