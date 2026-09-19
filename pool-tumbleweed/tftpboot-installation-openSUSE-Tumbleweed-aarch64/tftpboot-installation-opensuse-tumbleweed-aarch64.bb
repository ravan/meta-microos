SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.178-1.9.noarch.rpm"
RPM_HASH = "99ef29959b9769e8409f09d2b6b72cf510d50a2cea9403a4d79161cbd568754034facbc0a637663b5c45e998494556cc62abbf9a051211289271c7953d05632e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
