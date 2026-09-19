SUMMARY = "Desktop Notification Plugin for collectd"
DESCRIPTION = "Desktop Notification Support for collectd allow you to receive \
message delivery on your desktop."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-notify-desktop-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "17c830f235efe23a9617077943b0ef5bdc329efac024dcecea5246c98c5aa1e025645ced69d357abaa74ec0de7e72e3bd581512986ace58ccf6c0a50450da88d"

RPROVIDES:${PN} += "collectd-plugin-notify-desktop"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
