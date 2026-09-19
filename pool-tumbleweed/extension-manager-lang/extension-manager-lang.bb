SUMMARY = "Translations for package extension-manager"
DESCRIPTION = "Provides translations for the 'extension-manager' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.5"

RPM_NAME = "extension-manager-lang-0.6.5-1.6.noarch.rpm"
RPM_HASH = "613a7813f8cae62791610568d306597e806a0879a4dadbfaadc104135fbaad0e4eb54f8f234b3fad2905d64d8c41f64e11f2cf9339e7e2efa8214e83b7a74e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extension-manager-lang \
extension-manager-lang-all \
locale-extension-manager-ar \
locale-extension-manager-be \
locale-extension-manager-bg \
locale-extension-manager-ca \
locale-extension-manager-cs \
locale-extension-manager-da \
locale-extension-manager-de \
locale-extension-manager-el \
locale-extension-manager-es \
locale-extension-manager-et \
locale-extension-manager-eu \
locale-extension-manager-fa \
locale-extension-manager-fi \
locale-extension-manager-fr \
locale-extension-manager-ga \
locale-extension-manager-hi \
locale-extension-manager-hr \
locale-extension-manager-hu \
locale-extension-manager-it \
locale-extension-manager-ja \
locale-extension-manager-kk \
locale-extension-manager-ko \
locale-extension-manager-nb \
locale-extension-manager-nl \
locale-extension-manager-nn \
locale-extension-manager-oc \
locale-extension-manager-pl \
locale-extension-manager-pt \
locale-extension-manager-pt-BR \
locale-extension-manager-ru-RU \
locale-extension-manager-sv \
locale-extension-manager-ta \
locale-extension-manager-tr \
locale-extension-manager-uk \
locale-extension-manager-zh-CN \
locale-extension-manager-zh-TW"

RDEPENDS:${PN} += "extension-manager"

inherit rpm
