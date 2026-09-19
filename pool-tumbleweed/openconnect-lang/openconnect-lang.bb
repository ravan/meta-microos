SUMMARY = "Translations for package openconnect"
DESCRIPTION = "Provides translations for the 'openconnect' package."
LICENSE = "LGPL-2.1-or-later"

PV = "9.21"

RPM_NAME = "openconnect-lang-9.21-1.3.noarch.rpm"
RPM_HASH = "e259c2001bf8b74bc3f44d81f214a445393352399c4ede95e78bf000af133f9bc325d37357c0fb7f637769e4c1b124fdbcca07c6e4774ed8326b888f41ffa5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-openconnect-ar \
locale-openconnect-bs \
locale-openconnect-ca \
locale-openconnect-cs \
locale-openconnect-da \
locale-openconnect-de \
locale-openconnect-el \
locale-openconnect-en-GB \
locale-openconnect-en-US \
locale-openconnect-es \
locale-openconnect-eu \
locale-openconnect-fi \
locale-openconnect-fr \
locale-openconnect-gl \
locale-openconnect-hr \
locale-openconnect-hu \
locale-openconnect-id \
locale-openconnect-it \
locale-openconnect-ja \
locale-openconnect-ka \
locale-openconnect-lt \
locale-openconnect-nl \
locale-openconnect-pa \
locale-openconnect-pl \
locale-openconnect-pt \
locale-openconnect-pt-BR \
locale-openconnect-ru \
locale-openconnect-sk \
locale-openconnect-sl \
locale-openconnect-sr \
locale-openconnect-sr@latin \
locale-openconnect-sv \
locale-openconnect-tr \
locale-openconnect-ug \
locale-openconnect-uk \
locale-openconnect-zh-CN \
locale-openconnect-zh-TW \
openconnect-lang \
openconnect-lang-all"

RDEPENDS:${PN} += "openconnect"

inherit rpm
