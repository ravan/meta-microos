SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python314-libevt-20260705-1.2.aarch64.rpm"
RPM_HASH = "5fde6e0826b9cd713dd392994f7dd815b003dbefebe41c0664f69934d774dcb6fb4faa0256631dbafb8b361d37bcf50e9d1ec45bdaa48257f3596c4fcaf419de"

RPROVIDES:${PN} += "python314-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
