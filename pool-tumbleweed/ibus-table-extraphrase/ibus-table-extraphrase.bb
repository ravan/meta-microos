SUMMARY = "Extra phrases for IBus-table based IME"
DESCRIPTION = "provide Chinese extra phrases for ibus-table based IME, \
such as ibus-table-zhengma, ibus-table-wubi, ibus-table-cangjie5, \
ibus-table-erbi and etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.9.20110826"

RPM_NAME = "ibus-table-extraphrase-1.3.9.20110826-9.17.noarch.rpm"
RPM_HASH = "01eb38c4289fbfb6bf1bd9372cb007e22b2bed66e48a3cf4718b24c428183fe26675492d809e49ce15b31fcec1c99175fef22af1f5587697939b49bf1934c2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-extraphrase"

RDEPENDS:${PN} += ""

inherit rpm
