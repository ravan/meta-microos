SUMMARY = "libreport's micro report plugin"
DESCRIPTION = "Uploads micro-report to abrt server"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-ureport-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "6144ad54c84e25c62c01088d342600d7d2be3ce7bb5066c6d350dfba58c3c2bb68d6ba9fd10523626f28a8173882b7ab8490cb05cdc678601bbf672d9d44451c"

RPROVIDES:${PN} += "config-libreport-plugin-ureport \
libreport-plugin-ureport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport-web-2 \
libreport-web.so.2 \
libreport.so.2"

inherit rpm
