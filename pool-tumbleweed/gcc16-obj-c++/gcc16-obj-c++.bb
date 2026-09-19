SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-obj-c++-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "aee780dba392d81349377cb7210535ff96e30ef69dbcbfa0b664d4ab79dfed5f196ff0bfd7d2edc433d7d07b2347f2c6ce182fd24aec53c25646f1ecbd82cc3d"

RPROVIDES:${PN} += "gcc16-obj-c++"

RDEPENDS:${PN} += "gcc16-c++ \
gcc16-objc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
