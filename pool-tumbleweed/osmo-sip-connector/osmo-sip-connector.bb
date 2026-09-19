SUMMARY = "MNCC to SIP bridge for osmo-nitb"
DESCRIPTION = "Use the osmo-nitb MNCC interface and bridge it to SIP."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "osmo-sip-connector-1.6.0-2.8.aarch64.rpm"
RPM_HASH = "67e8a5674cd0c1573a58cdcf185b1285bfe28862f4fdab74fd7ccf30f5a6293e1d0f979516a1af4ee63a20a45024e7c55a6fcf2557343f9cfd24b73f47367e77"

RPROVIDES:${PN} += "config-osmo-sip-connector \
osmo-sip-connector"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua.so.0 \
libtalloc.so.2 \
systemd"

inherit rpm
