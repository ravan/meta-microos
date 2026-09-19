SUMMARY = "Translations for package gpaste"
DESCRIPTION = "Provides translations for the 'gpaste' package."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "gpaste-lang-50.9-1.1.noarch.rpm"
RPM_HASH = "16d2361f5c71840b380f451103a7e638f96525c8cef553ca6452d528bcbd03522410e7f95f1dd099c58b19b1c8aa41ffcbd62573e04bad6ddb587a31d8cb7fde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-lang \
gpaste-lang-all \
locale-gpaste-ar \
locale-gpaste-cs \
locale-gpaste-da \
locale-gpaste-de \
locale-gpaste-es \
locale-gpaste-fa \
locale-gpaste-fi \
locale-gpaste-fr \
locale-gpaste-gl \
locale-gpaste-is \
locale-gpaste-it \
locale-gpaste-ja \
locale-gpaste-ka \
locale-gpaste-ko \
locale-gpaste-nb-NO \
locale-gpaste-oc \
locale-gpaste-pl \
locale-gpaste-pt \
locale-gpaste-pt-BR \
locale-gpaste-ru \
locale-gpaste-sl \
locale-gpaste-sv \
locale-gpaste-ta \
locale-gpaste-tr \
locale-gpaste-uk \
locale-gpaste-vi \
locale-gpaste-zh-CN \
locale-gpaste-zh-Hant"

RDEPENDS:${PN} += "gpaste"

inherit rpm
