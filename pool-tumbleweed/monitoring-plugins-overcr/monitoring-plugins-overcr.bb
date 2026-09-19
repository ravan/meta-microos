SUMMARY = "Check Over-CR collector daemon"
DESCRIPTION = "This plugin attempts to contact the Over-CR collector daemon running on the \
remote UNIX server in order to gather the requested system information."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-overcr-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "9f992e6909a2f26c0d0be1107fbb3e51b5476de54f57f28061cf69f639c8726e417e926058aa8bd3152a8bd86e646e2e2df30ffd139f581ef28e12364e561c92"

RPROVIDES:${PN} += "monitoring-plugins-overcr \
nagios-plugins-overcr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
