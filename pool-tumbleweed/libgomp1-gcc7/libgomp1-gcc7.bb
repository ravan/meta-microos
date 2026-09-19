SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgomp1-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "301a5ef8884660cb8738be0b25492ab5bce1febeb2c92b3616cf47190bc93c9fb6da8b2a44eb033978c325eb911d772ae595686fd997c2fb3823a56fafe8793a"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1 \
libgomp1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
