SUMMARY = "Hungarian Ispell Dictionary"
DESCRIPTION = "This package contains the hungarian ispell dictionary."
LICENSE = "GPL-2.0+ | LGPL-2.1+ | MPL-1.1"

PV = "1.6.1"

RPM_NAME = "ispell-hungarian-1.6.1-2.7.noarch.rpm"
RPM_HASH = "d7b154f3c98c7de1effb008cc25add769ac3a4cc0e0ca36c07f797c46f721b9ec531496c2a7b6e006cff20f26e3b96ce287fbd2a4fa57417eae57d0cfba5342f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-hungarian \
locale-ispell-hu"

RDEPENDS:${PN} += ""

inherit rpm
