SUMMARY = "Development files for Nagios"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
This package provides include files that Nagios-related applications \
may compile against."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.12"

RPM_NAME = "nagios-devel-4.5.12-2.1.aarch64.rpm"
RPM_HASH = "3c15fa402aa34be112285d044948e69b10b6160bb1209feeef40449fc7540a1653877b84eb408ea6dd3382adb755d298eea60e337f52083adce42a8bf5d7b65b"

RPROVIDES:${PN} += "nagios-devel"

RDEPENDS:${PN} += "gcc \
nagios"

inherit rpm
