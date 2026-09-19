SUMMARY = "Common Scalar and List utility subroutines"
DESCRIPTION = "'Scalar::List::Utils' does nothing on its own. It is packaged with several \
useful modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.700.0"

RPM_NAME = "perl-Scalar-List-Utils-1.700.0-1.6.aarch64.rpm"
RPM_HASH = "bd9b18fb6d7ae5b5c3c7af55b06b7189316951360c47b2e2ce5ce0e8955116c9f894e28dfc9e260676a489cf000a3137a017f3b346c6bdc0fbd8b6830c93bcc0"

RPROVIDES:${PN} += "perl-List--Util \
perl-List--Util--XS \
perl-Scalar--List--Utils \
perl-Scalar--Util \
perl-Scalar-List-Utils \
perl-Sub--Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
