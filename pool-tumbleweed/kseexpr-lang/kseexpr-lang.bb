SUMMARY = "Translations for package kseexpr"
DESCRIPTION = "Provides translations for the 'kseexpr' package."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "kseexpr-lang-4.0.4.0-1.20.noarch.rpm"
RPM_HASH = "fe091286b256f59a6b05b8db75955453820d2a3c0ec88658f85c8da7e18995358a35209a134527ec1994675bc59929ceb1973d89b1df26192a76561461dfd5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kseexpr-lang \
kseexpr-lang-all \
locale-kseexpr-ca \
locale-kseexpr-ca@valencia \
locale-kseexpr-cs \
locale-kseexpr-de \
locale-kseexpr-en-GB \
locale-kseexpr-es \
locale-kseexpr-fr \
locale-kseexpr-it \
locale-kseexpr-ja \
locale-kseexpr-ko \
locale-kseexpr-lt \
locale-kseexpr-nl \
locale-kseexpr-nn \
locale-kseexpr-pl \
locale-kseexpr-pt \
locale-kseexpr-pt-BR \
locale-kseexpr-ru \
locale-kseexpr-sk \
locale-kseexpr-sl \
locale-kseexpr-sv \
locale-kseexpr-uk \
locale-kseexpr-zh-CN \
locale-kseexpr-zh-TW"

RDEPENDS:${PN} += "kseexpr"

inherit rpm
