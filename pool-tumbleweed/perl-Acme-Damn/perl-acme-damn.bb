SUMMARY = "'Unbless' Perl objects"
DESCRIPTION = "*Acme::Damn* provides a single routine, *damn()*, which takes a blessed \
reference (a Perl object), and _unblesses_ it, to return the original \
reference."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-Acme-Damn-0.90.0-1.5.aarch64.rpm"
RPM_HASH = "6270f5b76d344c5b8f99420262ae74a4a182174472eaae5de9b26419bd6ca63f6a2a1ae7c6cafd16076153f74c2eafa0963c4c3b82a8b160d7933786c915465c"

RPROVIDES:${PN} += "perl-Acme--Damn \
perl-Acme-Damn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
