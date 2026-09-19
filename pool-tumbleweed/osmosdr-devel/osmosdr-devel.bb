SUMMARY = "Development files for OsmoSDR"
DESCRIPTION = "Library headers for OsmoSDR. \
OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "osmosdr-devel-0.1+git.20151211-2.8.aarch64.rpm"
RPM_HASH = "3b4036f9c9e591826184ad30a95fbdaf2af545b6d8bf4a506b15537a1438671331f43d98f975755969d985e1d0625fba29f8bd88d5b4df32ecd319f3d736f46b"

RPROVIDES:${PN} += "osmosdr-devel \
pkgconfig-libosmosdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmosdr0"

inherit rpm
