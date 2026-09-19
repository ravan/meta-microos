SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "This package provides the segment and segmentlist objects, as well as the \
infinity object used to define semi-infinite and infinite segments."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python314-igwn-segments-2.0.0-1.9.aarch64.rpm"
RPM_HASH = "46a5ffe4353887c800afbbcd183d1d97ec07e794ca305f9be0c4463cdc6c83afd2ab24bea7a8544f4f7f5c25fefa30c10a013554d4f6122f755029f4d8a86549"

RPROVIDES:${PN} += "python3.14dist-igwn-segments \
python314-igwn-segments \
python3dist-igwn-segments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
