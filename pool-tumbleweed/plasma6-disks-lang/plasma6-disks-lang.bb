SUMMARY = "Translations for package plasma6-disks"
DESCRIPTION = "Provides translations for the 'plasma6-disks' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-disks-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "a81e2296f36128f6dc35046d7cd519f1c04848fc2931cf78711a991499c720be929307ff0db48d316c66f16d486df1d573cea299c5589a5bafe947d7b95a93ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-disks-ar \
locale-plasma6-disks-ast \
locale-plasma6-disks-az \
locale-plasma6-disks-bg \
locale-plasma6-disks-ca \
locale-plasma6-disks-ca@valencia \
locale-plasma6-disks-cs \
locale-plasma6-disks-da \
locale-plasma6-disks-de \
locale-plasma6-disks-el \
locale-plasma6-disks-en-GB \
locale-plasma6-disks-eo \
locale-plasma6-disks-es \
locale-plasma6-disks-et \
locale-plasma6-disks-eu \
locale-plasma6-disks-fi \
locale-plasma6-disks-fr \
locale-plasma6-disks-ga \
locale-plasma6-disks-gl \
locale-plasma6-disks-he \
locale-plasma6-disks-hi \
locale-plasma6-disks-hu \
locale-plasma6-disks-ia \
locale-plasma6-disks-id \
locale-plasma6-disks-is \
locale-plasma6-disks-it \
locale-plasma6-disks-ja \
locale-plasma6-disks-ka \
locale-plasma6-disks-ko \
locale-plasma6-disks-lt \
locale-plasma6-disks-lv \
locale-plasma6-disks-nl \
locale-plasma6-disks-nn \
locale-plasma6-disks-pa \
locale-plasma6-disks-pl \
locale-plasma6-disks-pt \
locale-plasma6-disks-pt-BR \
locale-plasma6-disks-ro \
locale-plasma6-disks-ru \
locale-plasma6-disks-sk \
locale-plasma6-disks-sl \
locale-plasma6-disks-sv \
locale-plasma6-disks-ta \
locale-plasma6-disks-tr \
locale-plasma6-disks-uk \
locale-plasma6-disks-zh-CN \
locale-plasma6-disks-zh-TW \
plasma6-disks-lang \
plasma6-disks-lang-all"

RDEPENDS:${PN} += "plasma6-disks"

inherit rpm
