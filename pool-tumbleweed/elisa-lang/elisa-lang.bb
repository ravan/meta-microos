SUMMARY = "Translations for package elisa"
DESCRIPTION = "Provides translations for the 'elisa' package."
LICENSE = "LGPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "elisa-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "8630df64b7060370f410c7886dbcd686446cce174188557d632fe6ceff02ac084bb9937b45690e6968f6f8fb5aca5cd9f0443ed0fb3efd11afd1c65343b8560a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elisa-lang \
elisa-lang-all \
locale-elisa-ar \
locale-elisa-ast \
locale-elisa-az \
locale-elisa-be \
locale-elisa-bg \
locale-elisa-bs \
locale-elisa-ca \
locale-elisa-ca@valencia \
locale-elisa-cs \
locale-elisa-da \
locale-elisa-de \
locale-elisa-el \
locale-elisa-en-GB \
locale-elisa-eo \
locale-elisa-es \
locale-elisa-et \
locale-elisa-eu \
locale-elisa-fi \
locale-elisa-fr \
locale-elisa-ga \
locale-elisa-gl \
locale-elisa-he \
locale-elisa-hi \
locale-elisa-hu \
locale-elisa-ia \
locale-elisa-id \
locale-elisa-is \
locale-elisa-it \
locale-elisa-ja \
locale-elisa-ka \
locale-elisa-ko \
locale-elisa-lt \
locale-elisa-lv \
locale-elisa-nb \
locale-elisa-nl \
locale-elisa-nn \
locale-elisa-pa \
locale-elisa-pl \
locale-elisa-pt \
locale-elisa-pt-BR \
locale-elisa-ro \
locale-elisa-ru \
locale-elisa-sk \
locale-elisa-sl \
locale-elisa-sv \
locale-elisa-ta \
locale-elisa-th \
locale-elisa-tr \
locale-elisa-ug \
locale-elisa-uk \
locale-elisa-zh-CN \
locale-elisa-zh-TW"

RDEPENDS:${PN} += "elisa"

inherit rpm
