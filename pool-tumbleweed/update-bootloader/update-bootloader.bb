SUMMARY = "Tool for boot loader configuration"
DESCRIPTION = "Shell script wrapper for configuring various boot loaders."
LICENSE = "GPL-2.0-or-later"

PV = "1.28"

RPM_NAME = "update-bootloader-1.28-1.1.aarch64.rpm"
RPM_HASH = "8ce907bece8f37ef726d6a681149d1afe2c37aaf8fd6fdd6a102f52c146f69d3ba1c317057c8972813a253441b85c89000ffa79bc2bbaf9991b0f8781749f332"

RPROVIDES:${PN} += "/sbin/update-bootloader \
perl-Bootloader \
update-bootloader"

RDEPENDS:${PN} += "/usr/bin/bash \
coreutils \
util-linux"

inherit rpm
