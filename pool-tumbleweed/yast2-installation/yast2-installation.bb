SUMMARY = "YaST2 - Installation Parts"
DESCRIPTION = "System installation code as present on installation media."
LICENSE = "GPL-2.0-only"

PV = "5.0.21"

RPM_NAME = "yast2-installation-5.0.21-1.1.noarch.rpm"
RPM_HASH = "b527b4f069c22ff0769bccc4d57a3c4aeaea32ab206ef64fd7d6ae185b3fcd0b32d19aef74cfe34c233e97613b75b92062ecc842516372b65452f73ddbaa24f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-installation"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/touch \
augeas-lenses \
awk \
coreutils \
fillup \
gzip \
iproute2 \
pciutils \
systemd \
tar \
yast2 \
yast2-bootloader \
yast2-country \
yast2-country-data \
yast2-network \
yast2-packager \
yast2-pkg-bindings \
yast2-proxy \
yast2-ruby-bindings \
yast2-security \
yast2-services-manager \
yast2-storage-ng \
yast2-users"

inherit rpm
