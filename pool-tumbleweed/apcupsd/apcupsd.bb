SUMMARY = "APC UPS Daemon (Powerful Daemon for APC UPSs)"
DESCRIPTION = "Controls and monitors the status of an APC UPS under Linux. Allows your \
computer or server to run for a specified length of time on UPS power \
then executes a controlled shutdown in the case of an extended power \
failure. Find APC on the Internet at http://www.apc.com/. \
 \
APC also made their PowerChute plus available for download at \
http://www.apc.com/tools/download/."
LICENSE = "GPL-2.0-only"

PV = "3.14.14"

RPM_NAME = "apcupsd-3.14.14-17.9.aarch64.rpm"
RPM_HASH = "ce08944e809da1be74d1b22936fe7834ee96a64524fef0bbe5da2701872256c5c0c6a51f8075c2c3df246065ced07a0d37f28055abfe0c78cdb8922a87278a62"

RPROVIDES:${PN} += "apcupsd \
config-apcupsd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libusb-0.1.so.4 \
libwrap.so.0 \
mailx \
sed \
systemd \
util-linux-tty-tools"

inherit rpm
