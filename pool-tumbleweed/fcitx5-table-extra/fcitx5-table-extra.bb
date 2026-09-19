SUMMARY = "Extra Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-extra provides extra table for Fcitx, including Boshiamy, Zhengma, Cangjie, and Quick."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "5.1.10"

RPM_NAME = "fcitx5-table-extra-5.1.10-1.3.noarch.rpm"
RPM_HASH = "f3b5c56c94ad2d9f1001c2354f51df2da1c65ab101f2e81dc332de0d25b9f3bb23c00679ba9ea0c43115ba4266c39f33f6fdd0bdc7d5431efdd62969ae8c24d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cantonese \
fcitx-table-cn-wu \
fcitx-table-cn-wubi-large \
fcitx-table-cn-zhengma \
fcitx-table-cn-zhengma-large \
fcitx-table-extra-lang \
fcitx-table-hk-cantonese \
fcitx-table-hk-jyutping \
fcitx-table-hk-stroke5 \
fcitx-table-t9 \
fcitx-table-tw-array30 \
fcitx-table-tw-array30-large \
fcitx-table-tw-boshiamy \
fcitx-table-tw-cangjie-large \
fcitx-table-tw-cangjie3 \
fcitx-table-tw-cangjie5 \
fcitx-table-tw-easy-large \
fcitx-table-tw-quick-classic \
fcitx-table-tw-quick3 \
fcitx-table-tw-quick5 \
fcitx-table-tw-smart-cangjie6 \
fcitx5-table-extra"

RDEPENDS:${PN} += "fcitx5"

inherit rpm
