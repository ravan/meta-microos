SUMMARY = "Development files for fcitx5-chinese-addons"
DESCRIPTION = "This package provides development files for fcitx5-chinese-addons."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.11"

RPM_NAME = "fcitx5-chinese-addons-devel-5.1.11-1.4.aarch64.rpm"
RPM_HASH = "ba02cc4f7b95214423fa34c9318072c835a7665dd73c0848dcac8de343f1d074d3fe1904a72d98ad1d907119db739659e8ba3c64bca06e65d9095af6de690d6e"

RPROVIDES:${PN} += "cmake-Fcitx5ModuleCloudPinyin \
cmake-Fcitx5ModulePinyinHelper \
cmake-Fcitx5ModulePunctuation \
fcitx5-chinese-addons-devel"

RDEPENDS:${PN} += "fcitx5-chinese-addons \
fcitx5-customphraseeditor6 \
fcitx5-pinyindictmanager6"

inherit rpm
