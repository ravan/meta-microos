SUMMARY = "Translations for package gnome-podcasts"
DESCRIPTION = "Provides translations for the 'gnome-podcasts' package."
LICENSE = "GPL-3.0-or-later"

PV = "25.3"

RPM_NAME = "gnome-podcasts-lang-25.3-3.2.noarch.rpm"
RPM_HASH = "c3f04b341384cffc477c45539794611707621d845b17ac2c10e766dfce72416b6730e8892f872ae47cab4a5b3c7cbe7c2dcdedf10e44b0ba7f98dac750dd2eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-podcasts-lang \
gnome-podcasts-lang-all \
locale-gnome-podcasts-be \
locale-gnome-podcasts-bg \
locale-gnome-podcasts-ca \
locale-gnome-podcasts-cs \
locale-gnome-podcasts-da \
locale-gnome-podcasts-de \
locale-gnome-podcasts-el \
locale-gnome-podcasts-en-GB \
locale-gnome-podcasts-es \
locale-gnome-podcasts-eu \
locale-gnome-podcasts-fa \
locale-gnome-podcasts-fi \
locale-gnome-podcasts-fr \
locale-gnome-podcasts-fur \
locale-gnome-podcasts-gl \
locale-gnome-podcasts-he \
locale-gnome-podcasts-hi \
locale-gnome-podcasts-hr \
locale-gnome-podcasts-hu \
locale-gnome-podcasts-id \
locale-gnome-podcasts-is \
locale-gnome-podcasts-it \
locale-gnome-podcasts-ka \
locale-gnome-podcasts-ko \
locale-gnome-podcasts-lv \
locale-gnome-podcasts-nl \
locale-gnome-podcasts-oc \
locale-gnome-podcasts-pl \
locale-gnome-podcasts-pt \
locale-gnome-podcasts-pt-BR \
locale-gnome-podcasts-ro \
locale-gnome-podcasts-ru \
locale-gnome-podcasts-sk \
locale-gnome-podcasts-sl \
locale-gnome-podcasts-sr \
locale-gnome-podcasts-sv \
locale-gnome-podcasts-tr \
locale-gnome-podcasts-uk \
locale-gnome-podcasts-zh-CN"

RDEPENDS:${PN} += "gnome-podcasts"

inherit rpm
