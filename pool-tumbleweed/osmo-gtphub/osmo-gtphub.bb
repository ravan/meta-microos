SUMMARY = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs"
DESCRIPTION = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-gtphub-1.8.0-2.14.aarch64.rpm"
RPM_HASH = "1029b4099dc129329a0dcf39602ffb923a78da82f0b91fc60c15afc9582781b05036691db0f0ac67c8028f49a1d6ac8dc3e96ad766ab44f2004f562ae9589c89"

RPROVIDES:${PN} += "config-osmo-gtphub \
osmo-gtphub"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libgtp.so.11 \
libosmo-sigtran.so.12 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
