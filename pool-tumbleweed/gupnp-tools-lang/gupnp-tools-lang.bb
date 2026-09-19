SUMMARY = "Translations for package gupnp-tools"
DESCRIPTION = "Provides translations for the 'gupnp-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "gupnp-tools-lang-0.12.4-1.1.noarch.rpm"
RPM_HASH = "4e0b657bfca48984a07800a777bf75a3e118fff21402adc01c40b6054a4ef62cdd4c028209ba41692a12711f9ac1a90209189109821046121bb044c664eba888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-tools-lang \
gupnp-tools-lang-all \
locale-gupnp-tools-bg \
locale-gupnp-tools-bs \
locale-gupnp-tools-cs \
locale-gupnp-tools-da \
locale-gupnp-tools-de \
locale-gupnp-tools-el \
locale-gupnp-tools-es \
locale-gupnp-tools-eu \
locale-gupnp-tools-fur \
locale-gupnp-tools-hi \
locale-gupnp-tools-hu \
locale-gupnp-tools-id \
locale-gupnp-tools-it \
locale-gupnp-tools-ja \
locale-gupnp-tools-ka \
locale-gupnp-tools-kk \
locale-gupnp-tools-pl \
locale-gupnp-tools-pt \
locale-gupnp-tools-pt-BR \
locale-gupnp-tools-ro \
locale-gupnp-tools-ru \
locale-gupnp-tools-sk \
locale-gupnp-tools-sl \
locale-gupnp-tools-sr \
locale-gupnp-tools-sr@latin \
locale-gupnp-tools-sv \
locale-gupnp-tools-tr \
locale-gupnp-tools-uk \
locale-gupnp-tools-zh-CN"

RDEPENDS:${PN} += "gupnp-tools"

inherit rpm
