SUMMARY = "C API for multipath-tools"
DESCRIPTION = "This library enables the use of libmultipath commands from C code."
LICENSE = "GPL-3.0-or-later"

PV = "0.15.1+229+suse.6c6f63e"

RPM_NAME = "libdmmp0_2_0-0.15.1+229+suse.6c6f63e-1.1.aarch64.rpm"
RPM_HASH = "0f87c5b20483e3a2cb9fd16f9591e297148f3e9d75ec511ce1620fdc4c31237aee16da1eb154610d53e175cfe868f816c1e18952ffde568fc3b1a27fb2d23969"

RPROVIDES:${PN} += "libdmmp.so.0.2.0 \
libdmmp0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libmpathcmd.so.0 \
multipath-tools"

inherit rpm
