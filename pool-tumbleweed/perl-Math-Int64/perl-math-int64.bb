SUMMARY = "Manipulate 64 bits integers in Perl"
DESCRIPTION = "This module adds support for 64 bit integers, signed and unsigned, to Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.570.0"

RPM_NAME = "perl-Math-Int64-0.570.0-2.14.aarch64.rpm"
RPM_HASH = "139b66f23ef13f3df311fabb10a8be20d13b086c4ee6cb2b2a23067b92d473df668afe2038bc90a6f66fa52753c7c7d43395418337289db74dc4513e4f9a4808"

RPROVIDES:${PN} += "perl-Math--Int64 \
perl-Math--Int64--die-on-overflow \
perl-Math--Int64--native-if-available \
perl-Math--UInt64 \
perl-Math-Int64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-base"

inherit rpm
