SUMMARY = "Translations for package celluloid"
DESCRIPTION = "Provides translations for the 'celluloid' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.30"

RPM_NAME = "celluloid-lang-0.30-1.3.noarch.rpm"
RPM_HASH = "24355ab5b88997e000f83479298f9494ef9ae0f4684c93d3b136ecabfb7be894a81551645a86451cf7019325eb4e95906afdf5083d2333dd5eb5dfba0390fce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "celluloid-lang \
celluloid-lang-all \
locale-celluloid-ar \
locale-celluloid-bg \
locale-celluloid-ca \
locale-celluloid-cs \
locale-celluloid-da \
locale-celluloid-de \
locale-celluloid-el \
locale-celluloid-eo \
locale-celluloid-es \
locale-celluloid-et \
locale-celluloid-eu \
locale-celluloid-fa \
locale-celluloid-fi \
locale-celluloid-fr \
locale-celluloid-ga \
locale-celluloid-hi \
locale-celluloid-hr \
locale-celluloid-hu \
locale-celluloid-id \
locale-celluloid-is \
locale-celluloid-it \
locale-celluloid-ja \
locale-celluloid-ka \
locale-celluloid-kk \
locale-celluloid-ko \
locale-celluloid-lt \
locale-celluloid-lv \
locale-celluloid-ms \
locale-celluloid-nb-NO \
locale-celluloid-nl \
locale-celluloid-oc \
locale-celluloid-pl \
locale-celluloid-pt-BR \
locale-celluloid-pt-PT \
locale-celluloid-ro \
locale-celluloid-ru \
locale-celluloid-sk \
locale-celluloid-sl \
locale-celluloid-sr \
locale-celluloid-sr@latin \
locale-celluloid-sv \
locale-celluloid-ta \
locale-celluloid-te \
locale-celluloid-tr \
locale-celluloid-uk \
locale-celluloid-zh-CN \
locale-celluloid-zh-TW"

RDEPENDS:${PN} += "celluloid"

inherit rpm
