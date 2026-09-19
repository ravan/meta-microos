SUMMARY = "Translations for package qalculate-gtk"
DESCRIPTION = "Provides translations for the 'qalculate-gtk' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "qalculate-gtk-lang-5.12.0-1.1.noarch.rpm"
RPM_HASH = "9a5f62599e5df449b7c5bc69e718f1274d5b12c94c8983a87d169f4ebb2de6eca38181d85b7325654bd60f7cce05dff0e330fdb2e73c2e4326fa93124f94c88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qalculate-gtk-ca \
locale-qalculate-gtk-de \
locale-qalculate-gtk-es \
locale-qalculate-gtk-fr \
locale-qalculate-gtk-hu \
locale-qalculate-gtk-ka \
locale-qalculate-gtk-nl \
locale-qalculate-gtk-pl \
locale-qalculate-gtk-pt-BR \
locale-qalculate-gtk-pt-PT \
locale-qalculate-gtk-ru \
locale-qalculate-gtk-sl \
locale-qalculate-gtk-sv \
locale-qalculate-gtk-zh-CN \
locale-qalculate-gtk-zh-TW \
qalculate-gtk-lang \
qalculate-gtk-lang-all"

RDEPENDS:${PN} += "qalculate-gtk"

inherit rpm
