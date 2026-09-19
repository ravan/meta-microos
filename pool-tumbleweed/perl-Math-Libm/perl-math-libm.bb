SUMMARY = "Perl extension for the C math library, libm"
DESCRIPTION = "This module is a translation of the C _math.h_ file. It exports the \
following selected constants and functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.00"

RPM_NAME = "perl-Math-Libm-1.00-3.55.aarch64.rpm"
RPM_HASH = "20d77aaf9746e92762b627ef102e11ec4adf022011dcdc317916811e8393ea28d440074634fbba118e421c4f1172008fdd2761c7fc543accd52ba9f3d4790557"

RPROVIDES:${PN} += "perl-Math--Libm \
perl-Math-Libm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
