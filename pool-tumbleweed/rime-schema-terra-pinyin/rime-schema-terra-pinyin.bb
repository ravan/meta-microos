SUMMARY = "Terra-pinyin input schema for rime"
DESCRIPTION = "terra-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-terra-pinyin-20250315-1.4.noarch.rpm"
RPM_HASH = "1100d4a223e6367b447b2d65e1dd406b298239d0b7ccd6e9325194eb5543795589a013a221f843e51b5e879551c9fadf501ac069b9407929177f43a64fc40b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-terra-pinyin"

RDEPENDS:${PN} += ""

inherit rpm
