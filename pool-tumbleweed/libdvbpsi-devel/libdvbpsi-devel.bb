SUMMARY = "Development headers and libraries for libdvbpsi"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
MPEG TS and DVB PSI tables. Current features: * Program Association Table \
(PAT), decoder and generator."
LICENSE = "LGPL-2.1+"

PV = "1.3.3"

RPM_NAME = "libdvbpsi-devel-1.3.3-1.23.aarch64.rpm"
RPM_HASH = "6752ce31a51d0cf659080775e2f26277f2be152e9821883caad355d6e3399670becaa10f4e87f6f2890130e4a04ae80ee6a74380cc65953481d2d265762f0e5a"

RPROVIDES:${PN} += "libdvbpsi-devel \
pkgconfig-libdvbpsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvbpsi10"

inherit rpm
