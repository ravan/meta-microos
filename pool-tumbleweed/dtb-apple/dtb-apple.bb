SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-apple-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "cab11672fd4040f07f9d785d816798cfde4dd33f9130e07b22e66a786fddb17b3d9050bd452883e830f7f74de22f5a93dc34f0ec410ba18dc5a3c5e02824f877"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
