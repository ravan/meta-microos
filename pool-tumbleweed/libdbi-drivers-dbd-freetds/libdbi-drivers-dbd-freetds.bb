SUMMARY = "FreeTDS driver for libdbi"
DESCRIPTION = "This driver provides connectivity to FreeTDS database servers \
through the libdbi database independent abstraction layer. Switching \
a program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-freetds-0.9.0.g53-4.8.aarch64.rpm"
RPM_HASH = "c3b62bda25a2f2a2ff9f0984c9da8875c7ca52321f1c24d57f9f108de3143d24bfb964027c88e1d886da1bd7c6b6ed8e775d78d6d1ae75f60d2f7f433c4ba54d"

RPROVIDES:${PN} += "libdbdfreetds.so \
libdbi-drivers-dbd-freetds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libct.so.4 \
libdbi.so.3"

inherit rpm
