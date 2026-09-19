SUMMARY = "Check average or maximum value in an MRTG logfile"
DESCRIPTION = "This plugin will check either the average or maximum value of one of the \
two variables recorded in an MRTG log file."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-mrtg-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "9163b6de9243fdeaafdac8af2f783291edc22fada37f38c9dcb1a3cebb45346ef99c07d0f1cda798d4a3f410af03b2162dbaec1754fd98ed6e1adf936e5a8584"

RPROVIDES:${PN} += "monitoring-plugins-mrtg \
nagios-plugins-mrtg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
