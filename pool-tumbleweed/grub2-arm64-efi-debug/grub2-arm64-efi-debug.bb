SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm64-efi-debug-2.14-19.1.noarch.rpm"
RPM_HASH = "0cef901def4b39b52483668ba35842612f0ed5b267aa61d26e0a3dbb3eb23b39d55bfbe1e75b384eaf2d5e0f5aef23957e7d7ca76bef0e6fe28ac7f0eea82e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
