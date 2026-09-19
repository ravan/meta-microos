SUMMARY = "Emulate MySQL PASSWORD() function"
DESCRIPTION = "Crypt::MySQL emulates MySQL PASSWORD() SQL function, without \
libmysqlclient. You can compare encrypted passwords, without real MySQL \
environment."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40.0"

RPM_NAME = "perl-Crypt-MySQL-0.40.0-1.8.aarch64.rpm"
RPM_HASH = "c9fd6bcd1d3e9d2148f36abd3bb85e0b885837fd899996d3821cc65c79f8d62e7d8c3f432b285929f7df6c98a0c7bfa4d2a6dccb8d603246f94be0c5d6f4d358"

RPROVIDES:${PN} += "perl-Crypt--MySQL \
perl-Crypt-MySQL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Digest--SHA1"

inherit rpm
