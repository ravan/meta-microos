SUMMARY = "The 'array' input methods for Chinese"
DESCRIPTION = "Array input method is a character-structured input method, including: \
array30: 27489 characters. \
array30-big: 27489 characters + Unicode ExtB."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-array-1.8.14-1.6.noarch.rpm"
RPM_HASH = "43dd7c6ab61256334659cb1f756dc63c88f605132f38adb441f80b30a9fc9ac198337a245835877d9f1a2b0db347d12a6cdd18cf4f68ff90e1b077e82eee51f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-array30 \
ibus-table-chinese-array \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
