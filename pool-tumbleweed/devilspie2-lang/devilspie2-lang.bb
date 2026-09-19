SUMMARY = "Translations for package devilspie2"
DESCRIPTION = "Provides translations for the 'devilspie2' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.45"

RPM_NAME = "devilspie2-lang-0.45-2.3.noarch.rpm"
RPM_HASH = "0c5d1801d08b64af43619d96bae5c6d96d753b560754e714f64ff7bfa55b2c44bf6b066e7a9da352ffc0f07e68e1ac260d73fecdd40a34a466e014393136a408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "devilspie2-lang \
devilspie2-lang-all \
locale-devilspie2-fi \
locale-devilspie2-fr \
locale-devilspie2-it \
locale-devilspie2-ja \
locale-devilspie2-nl \
locale-devilspie2-pt-BR \
locale-devilspie2-ru \
locale-devilspie2-sv"

RDEPENDS:${PN} += "devilspie2"

inherit rpm
