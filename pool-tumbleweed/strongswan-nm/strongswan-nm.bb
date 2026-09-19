SUMMARY = "NetworkManager plugin for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the NetworkManager plugin to control the \
charon IKEv2 daemon through D-Bus, designed to work using the \
NetworkManager-strongswan graphical user interface."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-nm-6.1.0-1.1.aarch64.rpm"
RPM_HASH = "7dc97cf97772bf9b659be8a093fdf44e330dcbd552aa01becd3326aeed28ecdd3777e633109ec01ade9765eb401d35ef0684b1c883bc374c4c8411f412b3553e"

RPROVIDES:${PN} += "strongswan-nm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcharon.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libstrongswan.so.0 \
strongswan"

inherit rpm
