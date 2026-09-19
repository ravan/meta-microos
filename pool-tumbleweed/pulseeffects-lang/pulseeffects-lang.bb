SUMMARY = "Translations for package pulseeffects"
DESCRIPTION = "Provides translations for the 'pulseeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.7"

RPM_NAME = "pulseeffects-lang-4.8.7-4.8.noarch.rpm"
RPM_HASH = "b5bc7e023e5710aecacb33be16d5e42bb341ff7c45bb1eea83a86f48d2121ee2fca2294d0e69add41325497b56d415f2cd7c8f30626b8bf1cc7f65f7fb48e20f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pulseeffects-cs \
locale-pulseeffects-de \
locale-pulseeffects-fr-FR \
locale-pulseeffects-hr \
locale-pulseeffects-it-IT \
locale-pulseeffects-pl \
locale-pulseeffects-pt-BR \
locale-pulseeffects-ru \
locale-pulseeffects-sk \
locale-pulseeffects-sv \
pulseeffects-lang \
pulseeffects-lang-all"

RDEPENDS:${PN} += "pulseeffects"

inherit rpm
