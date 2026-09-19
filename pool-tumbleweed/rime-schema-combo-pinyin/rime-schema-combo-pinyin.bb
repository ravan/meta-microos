SUMMARY = "Combo-pinyin input schema for rime"
DESCRIPTION = "combo-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-combo-pinyin-20250315-1.4.noarch.rpm"
RPM_HASH = "f0ab967de8789c89adaaa5537faa81ef06b1803991be8f014b9d3e9e25a512a689163cc617babcfa3ac63fef7b6fc2660ced3584c92d94c0745e24a32d77dcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-combo-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
