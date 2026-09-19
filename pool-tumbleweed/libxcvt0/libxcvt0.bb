SUMMARY = "CVT standard timing modeline generator"
DESCRIPTION = "libxcvt is a library providing a standalone version of the X server \
implementation of the VESA Coordinated Video Timings (CVT) standard \
timing modelines generator."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libxcvt0-0.1.3-1.7.aarch64.rpm"
RPM_HASH = "52ea9074288a753e4354823f68afbd93feb265ad79d504095b592f19ca0060b78a908b8930dec1216e15462c21091133611ce537a6b8ce116fea6e89f1536a86"

RPROVIDES:${PN} += "libxcvt.so.0 \
libxcvt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
