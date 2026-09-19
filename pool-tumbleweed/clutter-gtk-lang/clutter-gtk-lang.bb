SUMMARY = "Translations for package clutter-gtk"
DESCRIPTION = "Provides translations for the 'clutter-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "clutter-gtk-lang-1.8.4-5.30.noarch.rpm"
RPM_HASH = "da3d84e9a16829cb849dbebe104473699d30747b483a3a441456e6ba5f76a946a13fc8baba6e18ebd6aedf2349c5a6dca6c655acbc05ab450c9bf25c504d6f4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clutter-gtk-lang \
clutter-gtk-lang-all \
locale-clutter-gtk-ja \
locale-clutter-gtk-pl \
locale-clutter-gtk-zh-CN"

RDEPENDS:${PN} += "clutter-gtk"

inherit rpm
