SUMMARY = "Check MRTGEXT NLM running"
DESCRIPTION = "This plugin attempts to contact the MRTGEXT NLM running on a Novell server to \
gather the requested system information."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-nwstat-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "0192cb8225436db9316cc46ac231be9ce76ca0ed4178728e6857f7f9e8af3b08fd806bda03aed61b55116208418d7e7c2b58afdff8adc461e3844f6fe8dcb42d"

RPROVIDES:${PN} += "monitoring-plugins-nwstat \
nagios-plugins-nwstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
