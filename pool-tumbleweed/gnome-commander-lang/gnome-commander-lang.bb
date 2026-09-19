SUMMARY = "Translations for package gnome-commander"
DESCRIPTION = "Provides translations for the 'gnome-commander' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "gnome-commander-lang-2.0.3-1.3.noarch.rpm"
RPM_HASH = "1ca32f6c8c62073d79ec26f29c5b1b8085eaedb3c7532733dbe38851f151e5fe471f91e432950d0952804bfcc3042fe891674cacb973a46c3ee62411bfb9e9ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-commander-lang \
gnome-commander-lang-all \
locale-gnome-commander-ar \
locale-gnome-commander-bg \
locale-gnome-commander-bs \
locale-gnome-commander-ca \
locale-gnome-commander-cs \
locale-gnome-commander-da \
locale-gnome-commander-de \
locale-gnome-commander-dz \
locale-gnome-commander-el \
locale-gnome-commander-en-CA \
locale-gnome-commander-en-GB \
locale-gnome-commander-eo \
locale-gnome-commander-es \
locale-gnome-commander-eu \
locale-gnome-commander-fi \
locale-gnome-commander-fr \
locale-gnome-commander-ga \
locale-gnome-commander-hr \
locale-gnome-commander-hu \
locale-gnome-commander-id \
locale-gnome-commander-it \
locale-gnome-commander-ja \
locale-gnome-commander-ka \
locale-gnome-commander-kk \
locale-gnome-commander-ko \
locale-gnome-commander-lt \
locale-gnome-commander-mr \
locale-gnome-commander-nb \
locale-gnome-commander-ne \
locale-gnome-commander-nl \
locale-gnome-commander-oc \
locale-gnome-commander-pa \
locale-gnome-commander-pl \
locale-gnome-commander-pt \
locale-gnome-commander-pt-BR \
locale-gnome-commander-ro \
locale-gnome-commander-ru \
locale-gnome-commander-sk \
locale-gnome-commander-sl \
locale-gnome-commander-sq \
locale-gnome-commander-sr \
locale-gnome-commander-sr@latin \
locale-gnome-commander-sv \
locale-gnome-commander-th \
locale-gnome-commander-tr \
locale-gnome-commander-uk \
locale-gnome-commander-vi \
locale-gnome-commander-zh-CN \
locale-gnome-commander-zh-TW"

RDEPENDS:${PN} += "gnome-commander"

inherit rpm
