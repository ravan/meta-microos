SUMMARY = "Perl bindings for genders"
DESCRIPTION = "Necessary files for using genders with Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "perl-genders-1.32-1.10.aarch64.rpm"
RPM_HASH = "9ffae2b7bb80da76fe51732c758adb156d734d04d7b0756927117342a3d6003290ff31072c9db00c2901975b7e0713ae923bb02034d2f492cde6db6a04932307"

RPROVIDES:${PN} += "perl-Genders \
perl-Libgenders \
perl-genders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
perl-base"

inherit rpm
