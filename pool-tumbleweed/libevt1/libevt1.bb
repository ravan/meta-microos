SUMMARY = "Library to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libevt1-20260705-1.2.aarch64.rpm"
RPM_HASH = "f9370c634f985ae7976130abf9758f6d6f745566b38e07ed7bac6a3b622e649d6d4f83ef7d1f849e04f1b872b861728f668e004eb2d86f2b67b2f61d2a18378a"

RPROVIDES:${PN} += "libevt.so.1 \
libevt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
