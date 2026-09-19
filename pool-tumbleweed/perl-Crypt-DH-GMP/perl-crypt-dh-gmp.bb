SUMMARY = "Crypt::DH Using GMP Directly"
DESCRIPTION = "Crypt::DH::GMP is a (somewhat) portable replacement to Crypt::DH, \
implemented mostly in C."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.00012"

RPM_NAME = "perl-Crypt-DH-GMP-0.00012-4.48.aarch64.rpm"
RPM_HASH = "623134aff0a0ef2966ab2e46b6397551a368490099e8f383a002c07d68b70d00b93bde611a54317545d5d307bec29b1d0dcf0792ea096a1e161565650a954936"

RPROVIDES:${PN} += "perl-Crypt--DH--GMP \
perl-Crypt--DH--GMP--Compat \
perl-Crypt-DH-GMP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
