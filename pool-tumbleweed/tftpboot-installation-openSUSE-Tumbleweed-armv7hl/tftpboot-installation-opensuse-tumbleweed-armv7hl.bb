SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-armv7hl-17.178-1.9.noarch.rpm"
RPM_HASH = "52400f346cffa1178d2a6615f1f03250eb4ce9a6d1628fac536dac5cccd68fc28fbf3169f4ae37955504db5616b688a64eb93921eaa170a36b723a98e388966e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-armv7hl"

RDEPENDS:${PN} += ""

inherit rpm
