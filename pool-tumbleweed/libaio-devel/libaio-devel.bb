SUMMARY = "Development Files for Linux-native Asynchronous I/O Access"
DESCRIPTION = "This package provides header files to include, and libraries to link \
with, for the Linux-native asynchronous I/O facility ('async I/O', or \
'aio')."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.113"

RPM_NAME = "libaio-devel-0.3.113-5.5.aarch64.rpm"
RPM_HASH = "8e32553db033a81b811b0f63346e49364e7003bf9afaefeb3cb16c3dcd954bf9076090316b7c4e4d41628a84fd81372d24b2a4a25eec049a81002f4f9cd6d490"

RPROVIDES:${PN} += "libaio-devel"

RDEPENDS:${PN} += "glibc-devel \
libaio1"

inherit rpm
