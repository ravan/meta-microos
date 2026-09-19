SUMMARY = "Luna-pinyin input schema for rime"
DESCRIPTION = "luna-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-luna-pinyin-20250315-1.4.noarch.rpm"
RPM_HASH = "f569bdeb726318ac1abbf33591ef369fdf41bf234498c8a5463115dc197b09a004d6aae17f0fb98c8c1e8797e297a10e998213d79a9dc1b7c879a825195ac5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-luna-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
