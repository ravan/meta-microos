SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.178-1.9.noarch.rpm"
RPM_HASH = "643527c5dfd4bfd929f53ce60304e884c107616324c1c319958cde0bbab45a8acaee62cf2e9a1f28d08bddf701744f197e6788ee23527613c94b2338dcf40152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
