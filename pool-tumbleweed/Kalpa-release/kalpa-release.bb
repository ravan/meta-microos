SUMMARY = "Kalpa Desktop"
DESCRIPTION = "Kalpa desktop bundles the benefits of a rolling OS and a read-only root filesystem in a polished Desktop platform. It is a modern Linux Operating System, designed for minimal maintenance and tinkering. \
        It inherits the benefits of openSUSE Tumbleweed and MicroOS while redefining the operating system into a small, efficient and opinionated desktop."
LICENSE = "GPL-2.0-or-later"

PV = "20260915"

RPM_NAME = "Kalpa-release-20260915-3446.1.aarch64.rpm"
RPM_HASH = "10527b6fe7712d8a105d814119d92025024730e6d3068afb634a0d5d466eb96fe9af07f4dfc02da2bc6f67237211217b83153432ffe2da7a3d68d3697fab47d7"

RPROVIDES:${PN} += "Kalpa-release \
Kalpa-release-20260915 \
distribution-release \
product- \
product-Kalpa \
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
product-flavor-Kalpa"

inherit rpm
