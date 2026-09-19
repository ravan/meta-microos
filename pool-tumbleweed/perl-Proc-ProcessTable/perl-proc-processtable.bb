SUMMARY = "Perl extension to access the unix process table"
DESCRIPTION = "Perl interface to the unix process table."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "0.637.0"

RPM_NAME = "perl-Proc-ProcessTable-0.637.0-1.6.aarch64.rpm"
RPM_HASH = "726b1345e9df1b6ae1862c7475086df0f4a3dc22c88a167e538d86fa688eac5a9d516c3d194606b2f5501e13b3c46c88a42dc61cf57159937237123258c7391b"

RPROVIDES:${PN} += "perl-Proc--Killall \
perl-Proc--Killfam \
perl-Proc--ProcessTable \
perl-Proc--ProcessTable--Process \
perl-Proc-ProcessTable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
