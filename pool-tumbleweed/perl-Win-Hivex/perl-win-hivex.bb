SUMMARY = "Perl bindings for hivex"
DESCRIPTION = "This subpackage contains the Perl bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "perl-Win-Hivex-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "afbea6510df04b213ccd65e47f6a1ec325c5c01ab600d136d0c6d976b683d6c8c970bc11be1327541484b8ef1c4569684ae466ac7d185f8787adeecda0465ff6"

RPROVIDES:${PN} += "perl-Win--Hivex \
perl-Win--Hivex--Regedit \
perl-Win-Hivex"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
