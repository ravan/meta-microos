SUMMARY = "RPM macros for fde-tools"
DESCRIPTION = "This package contains the RPM macros for the bootloader packages to \
update the signature in the sealed key."
LICENSE = "GPL-2.0-only"

PV = "0.7.7"

RPM_NAME = "fde-tpm-helper-rpm-macros-0.7.7-1.1.noarch.rpm"
RPM_HASH = "177fb433070019adf5e19d1251ea7cdbf9b08547df7dadcb75ee9c0e3e27b1e9b43b133c0f0d6998d7c65f83e332e55e543fc035fb1d73ea3a0856cff38e3e5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tpm-helper-rpm-macros \
rpm-macro-fde-tpm-update-post \
rpm-macro-fde-tpm-update-posttrans \
rpm-macro-fde-tpm-update-requires"

RDEPENDS:${PN} += ""

inherit rpm
