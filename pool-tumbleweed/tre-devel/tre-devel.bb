SUMMARY = "Header files for the TRE regex library"
DESCRIPTION = "TRE is a POSIX-compatible regexp matching library with approximate \
This package contains the headers."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "tre-devel-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "494db1b9d043d96056f0927e2896c52abfff6e6645d435255c410921f9b38d15a10c0e441d21ee816364267d6bf54fc3b9b6afc0a37d69772eb72fffbf26cdf1"

RPROVIDES:${PN} += "pkgconfig-tre \
tre-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtre5"

inherit rpm
