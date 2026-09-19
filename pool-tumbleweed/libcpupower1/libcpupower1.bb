SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "libcpupower1-7.2.5-14.14.aarch64.rpm"
RPM_HASH = "945527fca2c618db8fdba4d2d411c49cc36e9eb1341c89ad1fb77af3b463d981da125d0406fc446132c5efd9798d62479c79f658d2da3f655d9050a9aef4b221"

RPROVIDES:${PN} += "libcpupower.so.1 \
libcpupower1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
