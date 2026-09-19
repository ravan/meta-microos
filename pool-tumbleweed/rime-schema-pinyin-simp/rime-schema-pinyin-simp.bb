SUMMARY = "Pinyin-simp input schema for rime"
DESCRIPTION = "pinyin-simp input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-pinyin-simp-20250315-1.4.noarch.rpm"
RPM_HASH = "427f56c3af24ea2c6dc77894ef3192f96a54b080350894078de480b16121b014818230e567f2a22cc9a6bbd5b37fba4e1fa67da17500c9d57d5eb349eb5f1b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-pinyin-simp"

RDEPENDS:${PN} += ""

inherit rpm
