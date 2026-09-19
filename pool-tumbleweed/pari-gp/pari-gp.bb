SUMMARY = "Frontend to the PARI Computer Algebra System"
DESCRIPTION = "PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions."
LICENSE = "GPL-2.0-only"

PV = "2.17.4"

RPM_NAME = "pari-gp-2.17.4-1.3.aarch64.rpm"
RPM_HASH = "1c2279dd79ff972fa39cdc311085fbbdc98106ba32a913957f8b04257bb0c9204b639a4b2cfe455c1889762f476824ed82225a0f7b76968c85eb8d5e80822387"

RPROVIDES:${PN} += "config-pari-gp \
pari-gp \
perl-PARI--822"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libpari-gmp-tls.so.9 \
libreadline.so.8"

inherit rpm
