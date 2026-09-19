SUMMARY = "Translit input method for IBus framework"
DESCRIPTION = "ibus-table-translit provides Translit input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-translit-1.3.21-1.5.noarch.rpm"
RPM_HASH = "c1933fb1d3c593f56756fa6063f8429bb233710697e8f26ac8311e19cb4117c3431b1bbe1d6a58ed19d2ecc3decd614da8bb823814966e0a6c0d81afda517e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-translit \
locale-ibus-ru"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
