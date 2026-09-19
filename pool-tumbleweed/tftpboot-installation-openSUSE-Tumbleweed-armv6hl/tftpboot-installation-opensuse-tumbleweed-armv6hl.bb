SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-armv6hl-17.178-1.9.noarch.rpm"
RPM_HASH = "efae23d8bb516e0e3801ece315694b57a17364eae0674facdadf515fe0b94ee6f786e40211c926bc9896232d21b01613f365eb9c1e94bae843f8045993ea05ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-armv6hl"

RDEPENDS:${PN} += ""

inherit rpm
