SUMMARY = "Development libraries for nss-shared-helper"
DESCRIPTION = "Header and library files for helpers meant to enable sharing of NSS \
crypto database."
LICENSE = "LGPL-2.1+"

PV = "1.0.10"

RPM_NAME = "nss-shared-helper-devel-1.0.10-9.37.aarch64.rpm"
RPM_HASH = "2bd7ee1bdd263d22e9b58a58b547c486e597e3475321d56816bbdf6207d6af2ec7319f39904082460ccc7c60f3570113280dc881ffee4e2a79156008b12f6d6d"

RPROVIDES:${PN} += "nss-shared-helper-devel \
pkgconfig-nss-shared-helper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnsssharedhelper0 \
mozilla-nss-devel \
pkgconfig-nss"

inherit rpm
