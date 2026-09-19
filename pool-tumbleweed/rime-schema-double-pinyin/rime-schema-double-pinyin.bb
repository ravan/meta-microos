SUMMARY = "Double-pinyin input schema for rime"
DESCRIPTION = "double-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-double-pinyin-20250315-1.4.noarch.rpm"
RPM_HASH = "56fd8057d955e0bbfd029d4d64ce6c20f5a70074fa1366033585ba7e6c5b6b83d3b310c55c0c66b50c171757f63d2771ff63da37fab1ddc1d84334e06f56829a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-double-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
