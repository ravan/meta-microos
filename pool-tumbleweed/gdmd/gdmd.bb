SUMMARY = "DMD compatible wrapper for the GDC D compiler"
DESCRIPTION = "GDMD is a wrapper for the GDC D compiler to provide a DMD compatible interface."
LICENSE = "BSL-1.0"

PV = "20210818T144245"

RPM_NAME = "gdmd-20210818T144245-1.12.noarch.rpm"
RPM_HASH = "ddc321b3119c06513e080e80a187762a1833e6b6796219857b4ba19fdd9590ec98dab75496c8e8514293ba8e057deaa8fe420f1da0d0a760bbbe6b8c5c6e090b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdmd"

RDEPENDS:${PN} += "/usr/bin/perl \
gcc-d"

inherit rpm
