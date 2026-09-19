SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-armv6hl-17.178-1.9.noarch.rpm"
RPM_HASH = "b40653cb53d7263fb4ab33932ee7d082c9099d0406060ce8b2ca84ae0c6e5cac182226080fd61acf9fee4aab3a5eef5036e65d157c50272e3d815eb28116238e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-armv6hl"

RDEPENDS:${PN} += ""

inherit rpm
