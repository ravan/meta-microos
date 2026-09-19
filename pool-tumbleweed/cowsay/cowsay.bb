SUMMARY = "Configurable talking cow (and some other creatures)"
DESCRIPTION = "cowsay is a configurable talking cow, written in Perl. It operates \
much as the figlet program does, and it written in the same spirit \
of silliness."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.4"

RPM_NAME = "cowsay-3.8.4-1.9.noarch.rpm"
RPM_HASH = "d0a670958a601ae23d81500e09b3f107a96b05c3185e52232e45a976191352c66655e08a782cf9ba917b67be373cf51c8adf53ad0b13e7d5c2bab73ef0a5ddd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cowsay"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
