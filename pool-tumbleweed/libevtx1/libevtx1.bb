SUMMARY = "Library to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library to access the Windows Event Log (EVT) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libevtx1-20260705-1.2.aarch64.rpm"
RPM_HASH = "864bbfe95e16c9fa5a73edc7574cd19588b3a7bcc2667f7fa0bff923a12b496b1788e96d66a0e8b001be56943928674ad54d53652ab1b1ad4f5d2898e685ba48"

RPROVIDES:${PN} += "libevtx.so.1 \
libevtx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwevt.so.1"

inherit rpm
