SUMMARY = "Aeon"
DESCRIPTION = "Aeon bundles the benefits of a rolling OS and a read-only root filesystem in a polished Desktop platform. It is a modern Linux Operating System, designed for minimal maintenance and tinkering. \
        It inherits the benefits of Tumbleweed while redefining the operating system into a small, efficient and opinionated desktop."
LICENSE = "GPL-2.0-or-later"

PV = "20260915"

RPM_NAME = "Aeon-release-20260915-3446.1.aarch64.rpm"
RPM_HASH = "51b6b22e41789de58e5a023dc1fc245ea7efee61b9a0f455920839b5f5e5321ddb28a0e8b433ee9b05a4f01d03c72724cf09c1c342abb99e06b90fd6c7b3e26e"

RPROVIDES:${PN} += "Aeon-release \
Aeon-release-20260915 \
distribution-release \
product- \
product-Aeon \
product-cpeid- \
product-endoflife- \
product-label- \
product-update- \
product-url-releasenotes \
suse-release \
suse-release-oss \
system-installation-"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
glibc \
product-flavor-Aeon"

inherit rpm
