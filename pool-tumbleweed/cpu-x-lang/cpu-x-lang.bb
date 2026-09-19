SUMMARY = "Translations for package cpu-x"
DESCRIPTION = "Provides translations for the 'cpu-x' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "cpu-x-lang-5.4.0-1.1.noarch.rpm"
RPM_HASH = "0ccea28f4fae091fab1ec54c16826d64313cebc778c0afc7c000fc4b73dc0a32c4a72e85fe69b8d97f2910148fa0637ad0c62afb70dcf37e19d2030ba199f499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-lang \
cpu-x-lang-all \
locale-cpu-x-af \
locale-cpu-x-ar \
locale-cpu-x-bg \
locale-cpu-x-ca \
locale-cpu-x-cs-CZ \
locale-cpu-x-da \
locale-cpu-x-de \
locale-cpu-x-el \
locale-cpu-x-eo \
locale-cpu-x-es \
locale-cpu-x-fa \
locale-cpu-x-fi \
locale-cpu-x-fr \
locale-cpu-x-ga \
locale-cpu-x-gl \
locale-cpu-x-hu \
locale-cpu-x-id \
locale-cpu-x-it \
locale-cpu-x-ja \
locale-cpu-x-ka \
locale-cpu-x-kk \
locale-cpu-x-ko \
locale-cpu-x-lv \
locale-cpu-x-ml \
locale-cpu-x-mr \
locale-cpu-x-ms \
locale-cpu-x-nb-NO \
locale-cpu-x-nl \
locale-cpu-x-pa \
locale-cpu-x-pl \
locale-cpu-x-pt \
locale-cpu-x-pt-BR \
locale-cpu-x-ro \
locale-cpu-x-ru \
locale-cpu-x-si \
locale-cpu-x-sv \
locale-cpu-x-ta \
locale-cpu-x-tr \
locale-cpu-x-uk \
locale-cpu-x-zh \
locale-cpu-x-zh-Hant"

RDEPENDS:${PN} += "cpu-x"

inherit rpm
