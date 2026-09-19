SUMMARY = "Tools to work with NUMBERTEXT and MONEYTEXT functions"
DESCRIPTION = "This package contains tools to work with NUMBERTEXT and MONEYTEXT functions"
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-tools-1.0.11-1.14.aarch64.rpm"
RPM_HASH = "3cfc1f71588fbafa024abfb9af8cb6760b4b8ca8fdc12725aee77db351adafb5501bcec1d69f1a697811d01ea2177a3a99d416522eecedf351a0e16688ebe88d"

RPROVIDES:${PN} += "libnumbertext-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnumbertext-1.0.so.0 \
libnumbertext-data \
libstdc++.so.6"

inherit rpm
