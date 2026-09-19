SUMMARY = "UEFI Secure Boot Certificate For Package xpadneo-kmp"
DESCRIPTION = "This package contains the UEFI Secure Boot certificate used to sign \
modules in the xpadneo-kmp packages."
LICENSE = "GPL-3.0-only"

PV = "0.10.1"

RPM_NAME = "xpadneo-ueficert-0.10.1-1.25.aarch64.rpm"
RPM_HASH = "918d4ffed3e2b68b49cc40b63b0c167683e96274de0e39a9fce033101a318630c613deaefdc21d8c105e3d5145185722eb5489ff0ccbd46518910a4182c1d36b"

RPROVIDES:${PN} += "xpadneo-ueficert"

RDEPENDS:${PN} += "/usr/bin/sh \
suse-kernel-rpm-scriptlets"

inherit rpm
