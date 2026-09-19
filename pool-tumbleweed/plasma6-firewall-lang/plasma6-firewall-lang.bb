SUMMARY = "Translations for package plasma6-firewall"
DESCRIPTION = "Provides translations for the 'plasma6-firewall' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-firewall-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "7b0824ca6dc3790df4485ca99f755af9ae70ed3d1a36a4e2978a8ade85562af99a21500d4c3529ddf618a46ccd94132eca8ccc0ee006669e084d14ca55150aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-firewall-ar \
locale-plasma6-firewall-ast \
locale-plasma6-firewall-az \
locale-plasma6-firewall-bg \
locale-plasma6-firewall-ca \
locale-plasma6-firewall-ca@valencia \
locale-plasma6-firewall-cs \
locale-plasma6-firewall-da \
locale-plasma6-firewall-de \
locale-plasma6-firewall-en-GB \
locale-plasma6-firewall-eo \
locale-plasma6-firewall-es \
locale-plasma6-firewall-et \
locale-plasma6-firewall-eu \
locale-plasma6-firewall-fi \
locale-plasma6-firewall-fr \
locale-plasma6-firewall-ga \
locale-plasma6-firewall-gl \
locale-plasma6-firewall-he \
locale-plasma6-firewall-hi \
locale-plasma6-firewall-hu \
locale-plasma6-firewall-ia \
locale-plasma6-firewall-id \
locale-plasma6-firewall-is \
locale-plasma6-firewall-it \
locale-plasma6-firewall-ja \
locale-plasma6-firewall-ka \
locale-plasma6-firewall-ko \
locale-plasma6-firewall-lt \
locale-plasma6-firewall-lv \
locale-plasma6-firewall-nl \
locale-plasma6-firewall-nn \
locale-plasma6-firewall-pa \
locale-plasma6-firewall-pl \
locale-plasma6-firewall-pt \
locale-plasma6-firewall-pt-BR \
locale-plasma6-firewall-ro \
locale-plasma6-firewall-ru \
locale-plasma6-firewall-sk \
locale-plasma6-firewall-sl \
locale-plasma6-firewall-sv \
locale-plasma6-firewall-ta \
locale-plasma6-firewall-tr \
locale-plasma6-firewall-uk \
locale-plasma6-firewall-zh-CN \
locale-plasma6-firewall-zh-TW \
plasma6-firewall-lang \
plasma6-firewall-lang-all"

RDEPENDS:${PN} += "plasma6-firewall"

inherit rpm
