SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "perl-apparmor-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "4ce85ae3e291fbf395b76c58cca5e3117d2890e08e7949148c99476401f14d7bfaf08b40c7499ed174c9cf3667d214c827428066580d46dd5b386e31fc691b1a"

RPROVIDES:${PN} += "perl-LibAppArmor \
perl-LibAppArmor--aa-log-record \
perl-LibAppArmorc \
perl-apparmor \
perl-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
perl"

inherit rpm
