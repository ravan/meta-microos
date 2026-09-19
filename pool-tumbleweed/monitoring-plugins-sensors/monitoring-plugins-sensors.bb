SUMMARY = "Check hardware status using lm_sensors"
DESCRIPTION = "This plugin checks hardware status using the lm_sensors package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-sensors-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "f7d66cc80f56754e0525a78d32e3240d0e484fcca527e9cb3322ed0a9c3ff5f4c710b3704443b1fd85cf36df1dc205674d936453995408ba64bbef7741e98b4c"

RPROVIDES:${PN} += "monitoring-plugins-sensors \
nagios-plugins-sensors"

RDEPENDS:${PN} += "/usr/bin/sh \
grep \
monitoring-plugins-common \
sensors"

inherit rpm
