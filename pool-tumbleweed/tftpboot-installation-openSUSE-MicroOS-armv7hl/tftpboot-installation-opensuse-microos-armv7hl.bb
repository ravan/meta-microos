SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-armv7hl-17.178-1.9.noarch.rpm"
RPM_HASH = "a10148a1f633cc8de85a1cc93cbe24681e8a016354d5affb2ea01aee85378d47357e35abc043d34b99c76b36bac4e0d6afa558b1e1b013055e3a729f8adeb33c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-armv7hl"

RDEPENDS:${PN} += ""

inherit rpm
