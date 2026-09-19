SUMMARY = "Nagios Remote Plug-In Executor"
DESCRIPTION = "NRPE can be used to run Nagios plugins on a remote machine for \
executing local checks. \
This package contains the software for NRPE server. \
It could be run by an inetd, or as a standalone daemon."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.1"

RPM_NAME = "nrpe-4.1.1-1.14.aarch64.rpm"
RPM_HASH = "c9e51627f325ada72d30496b5e6fcc685cefbd55082e66c71e936b5ce72948620979ff2cf4223feb31504bae2d5ace91773f6f364744ee69ff350dfd31334202"

RPROVIDES:${PN} += "config-nrpe \
nagios-nrpe \
nagios-nrpe-client \
nrpe"

RDEPENDS:${PN} += "/usr/bin/logger \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnss-usrfiles2 \
libssl.so.3 \
libwrap.so.0 \
netcfg \
pwdutils \
sed \
system-user-nagios"

inherit rpm
