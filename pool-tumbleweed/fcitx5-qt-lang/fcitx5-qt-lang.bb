SUMMARY = "Summary: Translations for package fcitx5-qt"
DESCRIPTION = "Provides translations for the fcitx5-qt package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-qt-lang-5.1.12-1.10.noarch.rpm"
RPM_HASH = "1c5b1664e165fc7852ade32afb40cf106bc74486f93c311655401578b086b56454733e8da7a609c1378bca8bb16700e6c01893470fd05fd2e75a0bb62a38d22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx5-qt-lang \
locale-fcitx5-qt-ca \
locale-fcitx5-qt-da \
locale-fcitx5-qt-de \
locale-fcitx5-qt-es \
locale-fcitx5-qt-fr \
locale-fcitx5-qt-he \
locale-fcitx5-qt-ja \
locale-fcitx5-qt-ka \
locale-fcitx5-qt-ko \
locale-fcitx5-qt-ru \
locale-fcitx5-qt-vi \
locale-fcitx5-qt-zh-CN \
locale-fcitx5-qt-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
