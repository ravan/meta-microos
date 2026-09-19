SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python313-libevtx-20260705-1.2.aarch64.rpm"
RPM_HASH = "8f150457a5c8d7c19ea14ddac1943dc85f08336924dc869b72be38139ef20c4114f51326038deccca2dad59dda4b27fdf630a03e2ba140282fec303fafd4d3ac"

RPROVIDES:${PN} += "python3-libevtx \
python313-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
