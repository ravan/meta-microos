SUMMARY = "Translations for package qps"
DESCRIPTION = "Provides translations for the 'qps' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "qps-lang-2.13.0-1.2.noarch.rpm"
RPM_HASH = "c6f4c0d20ca99fe6d4169b7f319f4ab4fa1b927abc52a1af5d09c53db9c6fbb5084fe3f33dbe3b0e75683b4e9bf2dc3faf7dac1a764e3d589872070ab487de68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qps-lang \
qps-lang-all"

RDEPENDS:${PN} += "qps"

inherit rpm
