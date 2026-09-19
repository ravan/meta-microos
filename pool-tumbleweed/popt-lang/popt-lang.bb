SUMMARY = "Translations for package popt"
DESCRIPTION = "Provides translations for the 'popt' package."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "popt-lang-1.19-2.3.noarch.rpm"
RPM_HASH = "bd7b78ca6814cfca09235a3f3ffc46af3a3aa26a4583408f6533a05ea8d5bf58deb2c7ad276060ce43fafef27e632bfe053b87b157d0030e22401dbdfaf79f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-popt-ca \
locale-popt-cs \
locale-popt-da \
locale-popt-de \
locale-popt-eo \
locale-popt-es \
locale-popt-fi \
locale-popt-fr \
locale-popt-ga \
locale-popt-gl \
locale-popt-hu \
locale-popt-id \
locale-popt-is \
locale-popt-it \
locale-popt-ja \
locale-popt-ka \
locale-popt-ko \
locale-popt-lv \
locale-popt-nb \
locale-popt-nl \
locale-popt-pl \
locale-popt-pt \
locale-popt-pt-BR \
locale-popt-ro \
locale-popt-ru \
locale-popt-si \
locale-popt-sk \
locale-popt-sl \
locale-popt-sv \
locale-popt-th \
locale-popt-tr \
locale-popt-uk \
locale-popt-vi \
locale-popt-wa \
locale-popt-zh-CN \
locale-popt-zh-TW \
popt-lang \
popt-lang-all"

RDEPENDS:${PN} += "popt"

inherit rpm
