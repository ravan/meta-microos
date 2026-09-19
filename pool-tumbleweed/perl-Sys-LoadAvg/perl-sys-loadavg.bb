SUMMARY = "Perl extension for accessing system CPU load averages"
DESCRIPTION = "Module for accessing System load averages."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Sys-LoadAvg-0.03-3.14.aarch64.rpm"
RPM_HASH = "f48fef3de1a92d97457fd0a3fd7c6ff03efbaabf64fd4e1b8476851d407581b7c785476c680959dc3379f2b44a1451eac6e8c7c48552eaa292e0346d903ece07"

RPROVIDES:${PN} += "perl-Sys--LoadAvg \
perl-Sys-LoadAvg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
