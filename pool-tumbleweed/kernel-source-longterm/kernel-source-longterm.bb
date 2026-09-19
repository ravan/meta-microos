SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2026-09-12 22:20:24 +0000 \
GIT Revision: 5fd8dd86aa6ed38923322b5ebd90adc85e8e7c55 \
GIT Branch: slowroll"
LICENSE = "GPL-2.0-only"

PV = "6.18.51"

RPM_NAME = "kernel-source-longterm-6.18.51-1.1.noarch.rpm"
RPM_HASH = "e49c15777e63ec6c79abf5137586a776e200e23e7e9810e77b281bedf0f0b5aa02dcac24d7337d9db9429aa3d2c2c5b053650703f7fc5b3627b8334010c9c693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-longterm \
kernel-source-longterm-srchash-5fd8dd86aa6ed38923322b5ebd90adc85e8e7c55 \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel-longterm \
sed"

inherit rpm
