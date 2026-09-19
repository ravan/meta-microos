SUMMARY = "Translations for package nautilus-image-converter"
DESCRIPTION = "Provides translations for the 'nautilus-image-converter' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "nautilus-image-converter-lang-0.4.0-4.3.noarch.rpm"
RPM_HASH = "064a727c5e43fb98aebd6230e8534e5fba6f33922e63b989c7658010102253655d6f3e6c60528070f1a06d311f753f4f0aea319c33d294e84abd1b374174b97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nautilus-image-converter-bg \
locale-nautilus-image-converter-ca \
locale-nautilus-image-converter-cs \
locale-nautilus-image-converter-de \
locale-nautilus-image-converter-es \
locale-nautilus-image-converter-fi \
locale-nautilus-image-converter-fr \
locale-nautilus-image-converter-it \
locale-nautilus-image-converter-ja \
locale-nautilus-image-converter-nl \
locale-nautilus-image-converter-pl \
locale-nautilus-image-converter-pt-BR \
locale-nautilus-image-converter-ru \
locale-nautilus-image-converter-sv \
nautilus-image-converter-lang \
nautilus-image-converter-lang-all"

RDEPENDS:${PN} += "nautilus-image-converter"

inherit rpm
