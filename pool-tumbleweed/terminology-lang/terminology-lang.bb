SUMMARY = "Translations for package terminology"
DESCRIPTION = "Provides translations for the 'terminology' package."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-lang-1.13.0-1.13.noarch.rpm"
RPM_HASH = "f239ff23717ccaef1c12bbe293f539607ed20ff9756645a5c1ca39bf9b39376ed9b00f5b81f20cdcd1f125a96a8be1da061225364726ba0fd6c206eb6b9b6973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-terminology-ca \
locale-terminology-da \
locale-terminology-de \
locale-terminology-el \
locale-terminology-eo \
locale-terminology-es \
locale-terminology-fi \
locale-terminology-fr \
locale-terminology-he \
locale-terminology-hi \
locale-terminology-hr \
locale-terminology-id \
locale-terminology-it \
locale-terminology-ja \
locale-terminology-ko \
locale-terminology-ms \
locale-terminology-nb-NO \
locale-terminology-nl \
locale-terminology-pl \
locale-terminology-pt \
locale-terminology-pt-BR \
locale-terminology-ru \
locale-terminology-si \
locale-terminology-sl \
locale-terminology-sr \
locale-terminology-sv \
locale-terminology-tr \
locale-terminology-uk \
locale-terminology-vi \
locale-terminology-zh-Hans \
terminology-lang \
terminology-lang-all"

RDEPENDS:${PN} += "terminology"

inherit rpm
