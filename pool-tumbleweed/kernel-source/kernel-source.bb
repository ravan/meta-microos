SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-source-7.2.5-1.1.noarch.rpm"
RPM_HASH = "165dd2e8bac8c8fc423f3fb4e9966b3e6e27d83683c96b49248d0cff076e00c029fcfa793dc6c0732ecb9b4b106f7bc347e59584c4dd01d7ca6456637240b9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
