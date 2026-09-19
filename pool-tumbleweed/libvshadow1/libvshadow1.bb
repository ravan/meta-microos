SUMMARY = "Library and tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "libvshadow1-20260714-1.2.aarch64.rpm"
RPM_HASH = "7762a19e27776f63505029143990c31c15018c13c924dfc141ad4a4c7f9c2da8c34b6a2b0c34f789b043525e8efbe5e5ba80d92ce6bf72cd61d90f6a88805682"

RPROVIDES:${PN} += "libvshadow.so.1 \
libvshadow1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1"

inherit rpm
