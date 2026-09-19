SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-obj-c++-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "a48220f4dc3e3d779eed3a49805efc5c209eeaf1d77a85f936725e4d6122d37c42a47ace7b1861f6715db74adf40718fd4e8abe2e2158f556c26b389b818c225"

RPROVIDES:${PN} += "gcc7-obj-c++"

RDEPENDS:${PN} += "gcc7-c++ \
gcc7-objc \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
