SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-exynos-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "4c1d6c7e115c01e371aa4d9d1c01a37378f931cc124b9cd127bf2b35cbb1858f2017333e19d7b2909de96a4a9d1a795273615f69f9ce7bb6191b5405a44160f9"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
