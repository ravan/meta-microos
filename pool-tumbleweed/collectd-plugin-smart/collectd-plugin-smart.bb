SUMMARY = "SMART Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor Self-Monitoring, Analysis and Reporting \
Technology (SMART) information from disk drives."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-smart-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "6dddbe8a5aec18962fd219c1352f11644b2858eb141a192d63d79f13957fcec60ca28dc6aae8165afeaf5ccf8cb82ee05f1fad339c4f5879810c4a4f0cd55740"

RPROVIDES:${PN} += "collectd-plugin-smart"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libudev.so.1"

inherit rpm
