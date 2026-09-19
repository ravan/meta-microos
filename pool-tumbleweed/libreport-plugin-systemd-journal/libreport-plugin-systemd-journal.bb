SUMMARY = "libreport's systemd journal reporter plugin"
DESCRIPTION = "The simple reporter plugin which writes a report to the systemd journal."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-systemd-journal-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "47baff768955f834b299fdeb83cc5c623150b0a114809453ecd520a54584ccdf16c960c0951c43a3746321c44a3259e0a0392f4fe6cb21fb2117171b87ec39de"

RPROVIDES:${PN} += "libreport-plugin-systemd-journal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport.so.2 \
libsystemd.so.0"

inherit rpm
