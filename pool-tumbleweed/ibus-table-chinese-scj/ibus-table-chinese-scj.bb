SUMMARY = "Smart Cangjie input method"
DESCRIPTION = "Smart Cangjie is an improved Cangjie base input method \
which handles Cangjie, Quick, Cantonese, Chinese punctuation, \
Japanese, 3000 frequent words by Hong Kong government, \
both Traditional and Simplified Chinese. \
 \
This package includes Smart Cangjie 6."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-scj-1.8.14-1.6.noarch.rpm"
RPM_HASH = "ee60dfb0716a302c391eba1476c1aa67feb2ec2f3ed5adc0bf776455af42db04c27ba735699c9f0bdb64d426cf3b6fd65d0465583593e057c54b52fb726a4b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cangjie \
ibus-table-chinese-scj \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
