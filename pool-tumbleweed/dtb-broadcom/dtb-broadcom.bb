SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-broadcom-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "9d15b7fcc4af7dffc7aca3943693ac8d0d62526e1912a228b94b9ba2621fd713062140c775381008532c292433535cb79767252aa51183892160c33410ba5ba4"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
