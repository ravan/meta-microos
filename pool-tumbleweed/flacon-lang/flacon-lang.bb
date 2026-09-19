SUMMARY = "Translations for package flacon"
DESCRIPTION = "Provides translations for the 'flacon' package."
LICENSE = "LGPL-2.1-or-later"

PV = "13.0.2"

RPM_NAME = "flacon-lang-13.0.2-1.1.noarch.rpm"
RPM_HASH = "70dba875825c9fa842cad92fdcf35fd43839de502ce98e15407b29cc252f3e4e8892b1cdd06d16508951eee6a7a6d831794f35c24b52868c99fb379ac7e2da32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flacon-lang \
flacon-lang-all"

RDEPENDS:${PN} += "flacon"

inherit rpm
