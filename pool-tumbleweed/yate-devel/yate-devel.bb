SUMMARY = "Development package for Yate"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use Yate."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "yate-devel-6.4.0-6.6.aarch64.rpm"
RPM_HASH = "238ada21a2ec5ba9e083eb19931646a2e538feec72bc39623fd8bc1eb3c6efab7dda9f5092504bc6cab8e5ee28c7df46a21f5782ab73919555a1c133c0103d5a"

RPROVIDES:${PN} += "pkgconfig-yate \
yate-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libyate6-4-0"

inherit rpm
