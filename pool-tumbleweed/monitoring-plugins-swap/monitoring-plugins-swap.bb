SUMMARY = "Check swap space"
DESCRIPTION = "Check swap space on local machine."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-swap-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "bec6b0373b9b8a6aac270ab4cce7a9fedb488756dcf319b3394beb853b7b5e2cf19053f0af06fa26c254111e968f52734b01290f9719586c700e59c74ef628e0"

RPROVIDES:${PN} += "config-monitoring-plugins-swap \
monitoring-plugins-swap \
nagios-plugins-swap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
