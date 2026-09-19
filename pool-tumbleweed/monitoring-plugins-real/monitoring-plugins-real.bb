SUMMARY = "Test REAL service"
DESCRIPTION = "This plugin will attempt to open an RTSP connection with the host.  Successul \
connects return STATE_OK, refusals and timeouts return STATE_CRITICAL, other \
errors return STATE_UNKNOWN.  Successful connects, but incorrect reponse \
messages from the host result in STATE_WARNING return values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-real-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "3d1868fb28a285e6d717cf1ab87472e56d0d10931ebea397be9c20c9851fcb6f2e7e8c40b8f211045408f083d493420121799df077e2be2fb3fad40aa78bf133"

RPROVIDES:${PN} += "monitoring-plugins-real \
nagios-plugins-real"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
