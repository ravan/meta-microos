SUMMARY = "HH2Serial GPS plugin for connman"
DESCRIPTION = "Provides HH2Serial GPS device support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-hh2serial-gps-1.42-2.16.aarch64.rpm"
RPM_HASH = "2a9a8f03ae72ebef7c70ac3bc2ae793cb5f0b1eb77b53e583f5f24ae0ae0f4abfd2145337d746639233fba717ee3303515e8d31d7c0e3b7af4b78a669892e5ba"

RPROVIDES:${PN} += "connman-plugin-hh2serial-gps"

RDEPENDS:${PN} += "connman \
libc.so.6"

inherit rpm
