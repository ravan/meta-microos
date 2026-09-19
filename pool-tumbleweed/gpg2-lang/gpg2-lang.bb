SUMMARY = "Translations for package gpg2"
DESCRIPTION = "Provides translations for the 'gpg2' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.22"

RPM_NAME = "gpg2-lang-2.5.22-1.1.noarch.rpm"
RPM_HASH = "c21770e5f1732766801e7452b0a76f8d6aa8651da32f1297d122d7c08447806f97e9f0be4cd20e796009f5b5b53b18169f5546e39137cb5338b2032c6ae8b185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpg2-lang \
gpg2-lang-all \
locale-gpg2-ca \
locale-gpg2-cs \
locale-gpg2-da \
locale-gpg2-de \
locale-gpg2-el \
locale-gpg2-en@boldquot \
locale-gpg2-en@quot \
locale-gpg2-eo \
locale-gpg2-es \
locale-gpg2-et \
locale-gpg2-fi \
locale-gpg2-fr \
locale-gpg2-gl \
locale-gpg2-hu \
locale-gpg2-id \
locale-gpg2-it \
locale-gpg2-ja \
locale-gpg2-ka \
locale-gpg2-nb \
locale-gpg2-nl \
locale-gpg2-pl \
locale-gpg2-pt \
locale-gpg2-ro \
locale-gpg2-ru \
locale-gpg2-sk \
locale-gpg2-sv \
locale-gpg2-tr \
locale-gpg2-uk \
locale-gpg2-zh-CN \
locale-gpg2-zh-TW"

RDEPENDS:${PN} += "gpg2"

inherit rpm
