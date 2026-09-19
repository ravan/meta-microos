SUMMARY = "Fast and correct UTF-8 IO"
DESCRIPTION = "This module provides a fast and correct UTF-8 PerlIO layer. Unlike perl's \
default ':utf8' layer it checks the input for correctness."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-PerlIO-utf8_strict-0.010-1.22.aarch64.rpm"
RPM_HASH = "107780e4e5b8604394e77ce1a1cc99b4c0755a9315a8ad1f9156b3b1fac8abf460fec585167813a34f34868fc447a528cd398295f31dc6f5919ec3ab3b8ac4ea"

RPROVIDES:${PN} += "perl-PerlIO--utf8-strict \
perl-PerlIO-utf8-strict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
