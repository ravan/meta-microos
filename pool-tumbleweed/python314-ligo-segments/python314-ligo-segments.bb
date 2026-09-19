SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "ligo-segments defines the segment, segmentlist, and segmentlistdict objects for \
manipulating semi-open intervals."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python314-ligo-segments-1.4.0-4.10.aarch64.rpm"
RPM_HASH = "ce053ca327919c79c8756f9f4c8438ed22ff9ce62e101539988b8e9e5dae220ae8bdc62239d554877fcacd0b7bac5c4d7cf0493af15035b9f12c641318be7840"

RPROVIDES:${PN} += "python3.14dist-ligo-segments \
python314-ligo-segments \
python3dist-ligo-segments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-six"

inherit rpm
