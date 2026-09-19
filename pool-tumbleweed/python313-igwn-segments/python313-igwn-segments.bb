SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "This package provides the segment and segmentlist objects, as well as the \
infinity object used to define semi-infinite and infinite segments."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python313-igwn-segments-2.0.0-1.9.aarch64.rpm"
RPM_HASH = "4989ca1577125c8ffd3f0ecddacdbc415c999b417b76df3d7fd1847ea41f6677a62c063b649ed0420c514c8ef76258b2f1812b768a9fd66fe8813a7d96f02ccf"

RPROVIDES:${PN} += "python3-igwn-segments \
python3.13dist-igwn-segments \
python313-igwn-segments \
python3dist-igwn-segments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
