SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "apparmor-utils-lang-5.0.2-2.1.noarch.rpm"
RPM_HASH = "45713842129864b37a7b65e021d66ddb685993cfc4e30c3ef6737c2f81db72015c76afd7e174cef62ee91407a3e9ae7cfa529e14b9b5763a1cb2a9f155ccaee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils-lang \
apparmor-utils-lang-all \
locale-apparmor-utils-af \
locale-apparmor-utils-be \
locale-apparmor-utils-bs \
locale-apparmor-utils-ca \
locale-apparmor-utils-cs \
locale-apparmor-utils-de \
locale-apparmor-utils-en-GB \
locale-apparmor-utils-es \
locale-apparmor-utils-fa \
locale-apparmor-utils-fr \
locale-apparmor-utils-gl \
locale-apparmor-utils-hi \
locale-apparmor-utils-id \
locale-apparmor-utils-it \
locale-apparmor-utils-ka \
locale-apparmor-utils-ko \
locale-apparmor-utils-oc \
locale-apparmor-utils-pl \
locale-apparmor-utils-pt \
locale-apparmor-utils-pt-BR \
locale-apparmor-utils-ro \
locale-apparmor-utils-ru \
locale-apparmor-utils-sv \
locale-apparmor-utils-tr \
locale-apparmor-utils-ug \
locale-apparmor-utils-uk \
locale-apparmor-utils-zh-CN"

RDEPENDS:${PN} += "apparmor-utils"

inherit rpm
