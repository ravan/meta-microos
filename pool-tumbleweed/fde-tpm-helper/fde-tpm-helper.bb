SUMMARY = "TPM helper for fde-tools"
DESCRIPTION = "This package contains the TPM helper script for the bootloader packages \
to update the signature in the sealed key."
LICENSE = "GPL-2.0-only"

PV = "0.7.7"

RPM_NAME = "fde-tpm-helper-0.7.7-1.1.noarch.rpm"
RPM_HASH = "a55af91e354cc6e5625ac1a238d9d4b17132da91efadcf936ac18ab83af6beb4abfd4670e1fc6a2133e93dae2e470e8bcea3ceca05c2810903f2f2c186d24f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tpm-helper"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
