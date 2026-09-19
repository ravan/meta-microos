SUMMARY = "Translations for package font-manager"
DESCRIPTION = "Provides translations for the 'font-manager' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "font-manager-lang-0.9.4-2.2.noarch.rpm"
RPM_HASH = "ef1e20e812f2248e64708adac0c0b4312a164738412c89026f75e4bfaf99b7ba7b51557bc7343825e2011f80e94fda2ea00a6180f7b46146b87910946a2fed25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-manager-lang \
font-manager-lang-all \
locale-font-manager-ar \
locale-font-manager-ca \
locale-font-manager-de \
locale-font-manager-eo \
locale-font-manager-es \
locale-font-manager-fr \
locale-font-manager-hr \
locale-font-manager-hu \
locale-font-manager-id \
locale-font-manager-it \
locale-font-manager-ja \
locale-font-manager-ko \
locale-font-manager-nb-NO \
locale-font-manager-nl \
locale-font-manager-oc \
locale-font-manager-pl \
locale-font-manager-pt-BR \
locale-font-manager-ro \
locale-font-manager-ru \
locale-font-manager-si \
locale-font-manager-sk \
locale-font-manager-sl \
locale-font-manager-sv \
locale-font-manager-ta \
locale-font-manager-tr \
locale-font-manager-uk \
locale-font-manager-zh-CN \
locale-font-manager-zh-HK \
locale-font-manager-zh-TW"

RDEPENDS:${PN} += "font-manager"

inherit rpm
