SUMMARY = "Libvirt SSH proxy"
DESCRIPTION = "Allows SSH into domains via VSOCK without need for network."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-ssh-proxy-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "8e14bc790926534b51e66285fb6560306d574e46572ab49edaaef556f7a01dac5f735d9399c3788a7b2a5222fca3a836328180082654c556a320ac05aea40a32"

RPROVIDES:${PN} += "config-libvirt-ssh-proxy \
libvirt-ssh-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-libs \
libvirt.so.0 \
libxml2.so.16"

inherit rpm
