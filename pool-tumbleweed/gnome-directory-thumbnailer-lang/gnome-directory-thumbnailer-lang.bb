SUMMARY = "Translations for package gnome-directory-thumbnailer"
DESCRIPTION = "Provides translations for the 'gnome-directory-thumbnailer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11+15"

RPM_NAME = "gnome-directory-thumbnailer-lang-0.1.11+15-2.2.noarch.rpm"
RPM_HASH = "b072ab477eeb67d47fd5f308e7ba607de87149a76a9a2a4c633b74f1432cc7c7691600793bf6256310f4aa67cb39ca41297bda8970a138907a56e9bb66bb8e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-directory-thumbnailer-lang \
gnome-directory-thumbnailer-lang-all \
locale-gnome-directory-thumbnailer-bs \
locale-gnome-directory-thumbnailer-ca \
locale-gnome-directory-thumbnailer-cs \
locale-gnome-directory-thumbnailer-da \
locale-gnome-directory-thumbnailer-de \
locale-gnome-directory-thumbnailer-el \
locale-gnome-directory-thumbnailer-es \
locale-gnome-directory-thumbnailer-eu \
locale-gnome-directory-thumbnailer-fr \
locale-gnome-directory-thumbnailer-fur \
locale-gnome-directory-thumbnailer-hr \
locale-gnome-directory-thumbnailer-hu \
locale-gnome-directory-thumbnailer-id \
locale-gnome-directory-thumbnailer-is \
locale-gnome-directory-thumbnailer-it \
locale-gnome-directory-thumbnailer-ja \
locale-gnome-directory-thumbnailer-lt \
locale-gnome-directory-thumbnailer-nb \
locale-gnome-directory-thumbnailer-nl \
locale-gnome-directory-thumbnailer-oc \
locale-gnome-directory-thumbnailer-pl \
locale-gnome-directory-thumbnailer-pt \
locale-gnome-directory-thumbnailer-pt-BR \
locale-gnome-directory-thumbnailer-ro \
locale-gnome-directory-thumbnailer-ru \
locale-gnome-directory-thumbnailer-sk \
locale-gnome-directory-thumbnailer-sl \
locale-gnome-directory-thumbnailer-sr \
locale-gnome-directory-thumbnailer-sr@latin \
locale-gnome-directory-thumbnailer-sv \
locale-gnome-directory-thumbnailer-tr \
locale-gnome-directory-thumbnailer-uk \
locale-gnome-directory-thumbnailer-zh-CN"

RDEPENDS:${PN} += "gnome-directory-thumbnailer"

inherit rpm
