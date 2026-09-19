SUMMARY = "Userspace library for the Netfilter Conntrack Helper extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter userspace helper infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cthelper-devel-1.0.1-1.15.aarch64.rpm"
RPM_HASH = "c915985825d16b46d336079380192b91b224ee33a6925a50ff1ae64ee6b8f18cbcaae3f3d1633b3ae80a2f585c36dd6537d2eaf54032d62d7a4a0a35e64d1fcf"

RPROVIDES:${PN} += "libnetfilter-cthelper-devel \
pkgconfig-libnetfilter-cthelper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-cthelper0"

inherit rpm
