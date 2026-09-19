SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "ligo-segments defines the segment, segmentlist, and segmentlistdict objects for \
manipulating semi-open intervals."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python313-ligo-segments-1.4.0-4.10.aarch64.rpm"
RPM_HASH = "b9174a5d889d76b23f3a8ec0cc2a050534e7dcbea249293a809c0ab531cdb9f9a1e2cbeb4764415a61cddc4f8980897b0d3659185440510d95a74ecbe1d3a245"

RPROVIDES:${PN} += "python3-ligo-segments \
python3.13dist-ligo-segments \
python313-ligo-segments \
python3dist-ligo-segments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-six"

inherit rpm
