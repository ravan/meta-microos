SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-devel-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "7a34194f61d50e5eeef91c12268bf0441e47badb4ab044b3bbd27236dde8bca863a885fac87058e206968399d44033a8f92b8773d2478ec43415517a2e1683bb"

RPROVIDES:${PN} += "libevtlog-devel \
pkgconfig-syslog-ng \
syslog-ng-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/sh \
pkgconfig-glib-2.0 \
syslog-ng"

inherit rpm
