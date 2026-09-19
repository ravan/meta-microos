SUMMARY = "Translations for package accessibility-inspector"
DESCRIPTION = "Provides translations for the 'accessibility-inspector' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "accessibility-inspector-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "f6b575603c32e1c07b87df870d78d22ddcbba27063c306309d90f00e8da4f266f9333aee56bdc464cd6057b2b21820ec70be10d0664a7e2fef2c46bed9c3ac85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accessibility-inspector-lang \
accessibility-inspector-lang-all \
locale-accessibility-inspector-ar \
locale-accessibility-inspector-ast \
locale-accessibility-inspector-az \
locale-accessibility-inspector-ca \
locale-accessibility-inspector-ca@valencia \
locale-accessibility-inspector-cs \
locale-accessibility-inspector-de \
locale-accessibility-inspector-en-GB \
locale-accessibility-inspector-eo \
locale-accessibility-inspector-es \
locale-accessibility-inspector-eu \
locale-accessibility-inspector-fi \
locale-accessibility-inspector-fr \
locale-accessibility-inspector-ga \
locale-accessibility-inspector-gl \
locale-accessibility-inspector-he \
locale-accessibility-inspector-hi \
locale-accessibility-inspector-hu \
locale-accessibility-inspector-ia \
locale-accessibility-inspector-it \
locale-accessibility-inspector-ja \
locale-accessibility-inspector-ka \
locale-accessibility-inspector-ko \
locale-accessibility-inspector-lt \
locale-accessibility-inspector-lv \
locale-accessibility-inspector-nl \
locale-accessibility-inspector-pl \
locale-accessibility-inspector-pt-BR \
locale-accessibility-inspector-ro \
locale-accessibility-inspector-ru \
locale-accessibility-inspector-sk \
locale-accessibility-inspector-sl \
locale-accessibility-inspector-sq \
locale-accessibility-inspector-sv \
locale-accessibility-inspector-tr \
locale-accessibility-inspector-ug \
locale-accessibility-inspector-uk \
locale-accessibility-inspector-zh-CN \
locale-accessibility-inspector-zh-TW"

RDEPENDS:${PN} += "accessibility-inspector"

inherit rpm
