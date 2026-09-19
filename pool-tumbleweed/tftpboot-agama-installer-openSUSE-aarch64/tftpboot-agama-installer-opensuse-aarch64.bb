SUMMARY = "Product Composer Base Images (extracted PXE images)"
DESCRIPTION = "Loaders that can be used for PXE boot, extracted from the installer \
content."
LICENSE = "SUSE-EULA"

PV = "24.0.0"

RPM_NAME = "tftpboot-agama-installer-openSUSE-aarch64-24.0.0-2.14.noarch.rpm"
RPM_HASH = "daa11e3878a1baa84207e8a2e2d8e502b1c88a23ecb936fc878ad9c6b1658fb3cb50e4bdb0a4a349e87e4dea840f174af2843a18fc5d1de0e9b5bbce2931d7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-agama-installer-openSUSE-aarch64"

RDEPENDS:${PN} += "group-tftp \
user-tftp"

inherit rpm
