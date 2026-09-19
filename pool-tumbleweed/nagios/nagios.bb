SUMMARY = "The Nagios Network Monitor"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
The actual service checks are performed by separate 'plugin' programs \
which return the status of the checks to Nagios. The plugins are \
available at http://nagios-plugins.org/. \
 \
This package provides core programs for Nagios. The web interface, \
documentation, and development files are built as separate packages."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.12"

RPM_NAME = "nagios-4.5.12-2.1.aarch64.rpm"
RPM_HASH = "fe97e911a8db035edfb98cd53f863ffb395452bd4c8659213761c56419636cba4a875c84a02e6188243e3613ede939a94186f38a8760ff9e09186baee45e25cd"

RPROVIDES:${PN} += "config-nagios \
monitoring-daemon \
nagios"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/logger \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
grep \
group-nagcmd \
group-nagios \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
mailx \
permissions \
sed \
system-user-nagios \
user-nagios"

inherit rpm
