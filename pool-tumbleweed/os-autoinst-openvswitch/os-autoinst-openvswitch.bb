SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788768889.879c500"

RPM_NAME = "os-autoinst-openvswitch-5.1788768889.879c500-1.1.aarch64.rpm"
RPM_HASH = "a40780cf62914d534533191a6ac2d8f81aa50c86c49e9c33f014aa626f975611d05e33b0f833ccd635d1ee949070941585deab005158266e15ff9e221784ea2c"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
dbus-1 \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
