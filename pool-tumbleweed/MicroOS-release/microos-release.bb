SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20260915"

RPM_NAME = "MicroOS-release-20260915-3446.1.aarch64.rpm"
RPM_HASH = "83962fd8fe29591f2c65d167704a38a6431bc7dfc49537708fd67583a68c566e649e1142de70f375b534750e4bdf9c6fa16486d39b65a06c9b8371b863b2c259"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20260915 \
distribution-release \
openSUSE-MicroOS-release \
openSUSE-Tumbleweed-Kubic-release \
product- \
product-MicroOS \
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
product-flavor-MicroOS"

inherit rpm
