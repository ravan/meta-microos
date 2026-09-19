SUMMARY = "IDO PostgreSQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO PostgreSQL database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "icinga2-ido-pgsql-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "aa71c532bb6826bcefa285ab4e22c10bcb0fb0c96ee1f53f088c0a0c46d9e24d139cb990d62c987474da686c8c17ee4d694cce7d32d9b86fc463d143d0c29897"

RPROVIDES:${PN} += "config-icinga2-ido-pgsql \
icinga2-ido-pgsql \
libpgsql-shim.so.2.16.5"

RDEPENDS:${PN} += "/usr/bin/sh \
group-icinga \
icinga2-bin \
libpq.so.5 \
libstdc++.so.6 \
user-icinga"

inherit rpm
