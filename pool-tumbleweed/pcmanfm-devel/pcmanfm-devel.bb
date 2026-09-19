SUMMARY = "Development files for PCManFM"
DESCRIPTION = "Development files for PCManFM."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0+git20251208.0908744"

RPM_NAME = "pcmanfm-devel-1.4.0+git20251208.0908744-1.4.noarch.rpm"
RPM_HASH = "9823086d39df8fd44eabb16f709a0aeeec55cf0d9931ce85b95138bae498a819f62db91b3e7db00374165795c670fcff759ef44453d32ff2cfcbe7173552ade3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcmanfm-devel"

RDEPENDS:${PN} += "gtk3-devel \
libfm-gtk3-4 \
libfm4 \
pcmanfm \
pkgconfig"

inherit rpm
