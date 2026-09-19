SUMMARY = "Provides the HTML and CGI files for the Nagios web interface"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
Several CGI programs are included with Nagios in order to allow you to \
view the current service status, problem history, notification history, \
and log file via the web. This package provides the HTML and CGI files \
for the Nagios web interface."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.12"

RPM_NAME = "nagios-www-4.5.12-2.1.aarch64.rpm"
RPM_HASH = "87fb0211b176da1c4d1c112206be84298e68d35888667223e1ef7041469b1d8b2d57e7f20d459e3cf1ae76f4e557e6b10b48496aa7add63d83b91030cdc4a372"

RPROVIDES:${PN} += "config-nagios-www \
monitoring-webfrontend \
nagios-www"

RDEPENDS:${PN} += "/usr/bin/logger \
/usr/bin/perl \
/usr/bin/sh \
apache2 \
coreutils \
gawk \
gd \
grep \
group-nagcmd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6 \
mod-php-any \
nagios \
php \
sed \
shadow"

inherit rpm
