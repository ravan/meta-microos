SUMMARY = "The so-called 'easy' input method for Chinese"
DESCRIPTION = "Easy phrase-wise input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-easy-1.8.14-1.6.noarch.rpm"
RPM_HASH = "9dd05b4bfee98f9dfe78991d2ec01258841d8433595657ff0f2a0cbef69e046cc23621b34af0957e48a4e99dde1427bed162e8cfb6a91733976336edff6d008c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-easy \
ibus-table-easy \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
