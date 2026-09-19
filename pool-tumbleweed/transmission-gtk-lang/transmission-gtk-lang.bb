SUMMARY = "Translations for package transmission-gtk"
DESCRIPTION = "Provides translations for the 'transmission-gtk' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-gtk-lang-4.1.3-1.2.noarch.rpm"
RPM_HASH = "54e27f21360b30beb5b8a0a1988dd45d739ab0cdc601546183d689fca0341748d577e7f3264647e49cee91581b0f2f2391a1d636cf85fe75cd821790d78c7036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-transmission-gtk-da \
locale-transmission-gtk-de \
locale-transmission-gtk-el \
locale-transmission-gtk-es \
locale-transmission-gtk-eu \
locale-transmission-gtk-fi \
locale-transmission-gtk-fr \
locale-transmission-gtk-he \
locale-transmission-gtk-hu \
locale-transmission-gtk-is \
locale-transmission-gtk-ja \
locale-transmission-gtk-nl \
locale-transmission-gtk-pl \
locale-transmission-gtk-ru \
locale-transmission-gtk-sv \
locale-transmission-gtk-tr \
locale-transmission-gtk-uk \
locale-transmission-gtk-zh-CN \
locale-transmission-gtk-zh-TW \
transmission-gtk-lang \
transmission-gtk-lang-all"

RDEPENDS:${PN} += "transmission-gtk"

inherit rpm
