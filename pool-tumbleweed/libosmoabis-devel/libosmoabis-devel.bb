SUMMARY = "Development files for the Osmocom GSM A-bis library"
DESCRIPTION = "This library contains common/shared code regarding the GSM A-bis \
interface. It also implements drivers for mISDN and DAHDI-based E1 \
cards, as well as some A-bis/IP dialects. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoabis."
LICENSE = "AGPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libosmoabis-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "d38dc2cf5ee0581c563ee8d39ab218077665978a18de41b4c8931faddb8d30fbcfc2f5a38b0467b54e8a371e6e63b63e1d286700bca013c0df932881816e0c17"

RPROVIDES:${PN} += "libosmoabis-devel \
pkgconfig-libosmoabis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmoabis17 \
libosmocore-devel \
libosmogsm-devel \
pkgconfig-libosmo-netif \
pkgconfig-libosmocore"

inherit rpm
