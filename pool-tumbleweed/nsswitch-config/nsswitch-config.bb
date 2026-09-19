SUMMARY = "Handling nsswitch.conf entries"
DESCRIPTION = "Tool which merges different nsswitch configuration file snippets into one single \
nsswitch.conf file, which is normally located in the /etc directory."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7"

RPM_NAME = "nsswitch-config-0.0.7-1.5.aarch64.rpm"
RPM_HASH = "c97d47c939a65fd91dc63e7ec9ec18b5790bb9f3d630b50f13d7a33310d0003247da0d3af9f27178b0be3cec4413901fc577d0360b02306c1615551304b3bafa"

RPROVIDES:${PN} += "nsswitch-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0"

inherit rpm
