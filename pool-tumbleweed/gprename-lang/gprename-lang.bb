SUMMARY = "Translations for package gprename"
DESCRIPTION = "Provides translations for the 'gprename' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.20230429"

RPM_NAME = "gprename-lang-5.0.20230429-1.9.noarch.rpm"
RPM_HASH = "e39f579168013452e262a2b985db3bb41e8d195f1496f2a806c4d32200c9007e269122e716630cfc433e98a50e99b02e9855c9a35b9589f0c195f9d4a75ae99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gprename-lang \
gprename-lang-all \
locale-gprename-ca \
locale-gprename-de \
locale-gprename-es \
locale-gprename-et \
locale-gprename-fr \
locale-gprename-id \
locale-gprename-it \
locale-gprename-nl \
locale-gprename-pl \
locale-gprename-pt-BR \
locale-gprename-ro \
locale-gprename-ru \
locale-gprename-sv \
locale-gprename-zh-CN"

RDEPENDS:${PN} += "gprename"

inherit rpm
