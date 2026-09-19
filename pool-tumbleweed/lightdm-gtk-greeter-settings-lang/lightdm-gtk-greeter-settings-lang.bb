SUMMARY = "Translations for package lightdm-gtk-greeter-settings"
DESCRIPTION = "Provides translations for the 'lightdm-gtk-greeter-settings' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.3"

RPM_NAME = "lightdm-gtk-greeter-settings-lang-1.2.3-1.3.noarch.rpm"
RPM_HASH = "72e9ae25bb7f2b35229bf5d87c45079c7cceba074deffb4e4c4ef7640d3b2f8c7599539cbfbfc6efa6f801b8d9a7fccf33a9ca877482d00255711adc81fcc563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-gtk-greeter-settings-lang \
lightdm-gtk-greeter-settings-lang-all \
locale-lightdm-gtk-greeter-settings-ar \
locale-lightdm-gtk-greeter-settings-be \
locale-lightdm-gtk-greeter-settings-br \
locale-lightdm-gtk-greeter-settings-ca \
locale-lightdm-gtk-greeter-settings-cs \
locale-lightdm-gtk-greeter-settings-da \
locale-lightdm-gtk-greeter-settings-de \
locale-lightdm-gtk-greeter-settings-el \
locale-lightdm-gtk-greeter-settings-es \
locale-lightdm-gtk-greeter-settings-et \
locale-lightdm-gtk-greeter-settings-fi \
locale-lightdm-gtk-greeter-settings-fr \
locale-lightdm-gtk-greeter-settings-he \
locale-lightdm-gtk-greeter-settings-hr \
locale-lightdm-gtk-greeter-settings-hu \
locale-lightdm-gtk-greeter-settings-id \
locale-lightdm-gtk-greeter-settings-it \
locale-lightdm-gtk-greeter-settings-ja \
locale-lightdm-gtk-greeter-settings-kk \
locale-lightdm-gtk-greeter-settings-ko \
locale-lightdm-gtk-greeter-settings-lt \
locale-lightdm-gtk-greeter-settings-nl \
locale-lightdm-gtk-greeter-settings-oc \
locale-lightdm-gtk-greeter-settings-pl \
locale-lightdm-gtk-greeter-settings-pt \
locale-lightdm-gtk-greeter-settings-pt-BR \
locale-lightdm-gtk-greeter-settings-ru \
locale-lightdm-gtk-greeter-settings-sl \
locale-lightdm-gtk-greeter-settings-sr \
locale-lightdm-gtk-greeter-settings-sv \
locale-lightdm-gtk-greeter-settings-tr \
locale-lightdm-gtk-greeter-settings-uk \
locale-lightdm-gtk-greeter-settings-zh-CN \
locale-lightdm-gtk-greeter-settings-zh-TW"

RDEPENDS:${PN} += "lightdm-gtk-greeter-settings"

inherit rpm
