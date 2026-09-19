SUMMARY = "Translations for package qqc2-desktop-style"
DESCRIPTION = "Provides translations for the 'qqc2-desktop-style' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.116.1"

RPM_NAME = "qqc2-desktop-style-lang-5.116.1-1.13.noarch.rpm"
RPM_HASH = "a9ad94065722963508c6817ce5504556da3f923560deb98c6b0f570070421f5b4ef6d8836fc3f0381c3102adfbfd7f9b296259b682e097ec4a6e2009dad466b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qqc2-desktop-style-ca \
locale-qqc2-desktop-style-ca@valencia \
locale-qqc2-desktop-style-cs \
locale-qqc2-desktop-style-de \
locale-qqc2-desktop-style-es \
locale-qqc2-desktop-style-fr \
locale-qqc2-desktop-style-gl \
locale-qqc2-desktop-style-it \
locale-qqc2-desktop-style-nl \
locale-qqc2-desktop-style-sl \
locale-qqc2-desktop-style-sv \
locale-qqc2-desktop-style-tr \
locale-qqc2-desktop-style-uk \
locale-qqc2-desktop-style-zh-CN \
locale-qqc2-desktop-style-zh-TW \
qqc2-desktop-style-lang \
qqc2-desktop-style-lang-all"

RDEPENDS:${PN} += "qqc2-desktop-style"

inherit rpm
