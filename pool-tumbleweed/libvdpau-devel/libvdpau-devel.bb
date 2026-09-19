SUMMARY = "VDPAU wrapper development files"
DESCRIPTION = "Note that this package only contains the VDPAU headers that are required to \
build applications. At runtime, the shared libraries are needed too and may \
be installed using the proprietary nVidia driver packages."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libvdpau-devel-1.5-5.4.aarch64.rpm"
RPM_HASH = "6bb65f1c7512930d748bb38eddea5c054f0bf33a53a68600ec7b4d75831acce5d3cae1a7d0df1a4b7465c621eddce191c1450fe9afb5ad68e0291e69f7d18f83"

RPROVIDES:${PN} += "libvdpau-devel \
pkgconfig-vdpau"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdpau1"

inherit rpm
