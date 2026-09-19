SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python314-libevtx-20260705-1.2.aarch64.rpm"
RPM_HASH = "fdab10a374d6a45593309957c7a51249124e05e366c27cfe18f993381a273813ce71b268bf82fe826f9133edfbffcc5888a3a8b60f058255a392da0527acf262"

RPROVIDES:${PN} += "python314-libevtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevtx.so.1 \
python-abi"

inherit rpm
