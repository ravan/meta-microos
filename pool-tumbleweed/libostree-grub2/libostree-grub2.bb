SUMMARY = "GRUB2 integration for OSTree"
DESCRIPTION = "GRUB2 integration for OSTree"
LICENSE = "LGPL-2.0-or-later"

PV = "2026.4"

RPM_NAME = "libostree-grub2-2026.4-1.1.noarch.rpm"
RPM_HASH = "b77c520bb818f9255d2a9df8bf5f1cac35f5b5340dc1ccd325ced2f82906baa68746b3089208a596981c32c32a6aed03066ce051dc05ca93253820291eaff0c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libostree-grub2 \
libostree-grub2 \
ostree-grub2"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2-efi"

inherit rpm
