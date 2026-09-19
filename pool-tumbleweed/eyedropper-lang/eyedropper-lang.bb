SUMMARY = "Translations for package eyedropper"
DESCRIPTION = "Provides translations for the 'eyedropper' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "eyedropper-lang-2.2.1-1.5.noarch.rpm"
RPM_HASH = "e777a86ae4065fbe9df91be97ea5602192c95d4c973d199a123667f7e24b12ed8f1eecedf053f25158fd329ce95fd09584a10677bc5ae97a6ed099565c250444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eyedropper-lang \
eyedropper-lang-all \
locale-eyedropper-ar \
locale-eyedropper-bg \
locale-eyedropper-bn \
locale-eyedropper-ca \
locale-eyedropper-cs \
locale-eyedropper-de \
locale-eyedropper-es \
locale-eyedropper-et \
locale-eyedropper-eu \
locale-eyedropper-fi \
locale-eyedropper-fr \
locale-eyedropper-he \
locale-eyedropper-hi \
locale-eyedropper-hr \
locale-eyedropper-hu \
locale-eyedropper-it \
locale-eyedropper-ka \
locale-eyedropper-kk \
locale-eyedropper-nb-NO \
locale-eyedropper-nl \
locale-eyedropper-pl \
locale-eyedropper-pt \
locale-eyedropper-pt-BR \
locale-eyedropper-ro \
locale-eyedropper-ru \
locale-eyedropper-sv \
locale-eyedropper-ta \
locale-eyedropper-tr \
locale-eyedropper-uk \
locale-eyedropper-vi \
locale-eyedropper-zh-CN"

RDEPENDS:${PN} += "eyedropper"

inherit rpm
