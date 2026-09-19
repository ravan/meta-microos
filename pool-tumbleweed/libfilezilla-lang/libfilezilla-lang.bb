SUMMARY = "Translations for package libfilezilla"
DESCRIPTION = "Provides translations for the 'libfilezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.57.0"

RPM_NAME = "libfilezilla-lang-0.57.0-1.1.noarch.rpm"
RPM_HASH = "ed0ca4fb11d6e1a4ee2b18663a93fb9ad70a03f0c4faff8da47ab8742b1a7631bd282636b31eb205ab5a489ffe5b31a1f0e40e808cc4ddaa8d55d6d466b6ab82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfilezilla-lang \
libfilezilla-lang-all \
locale-libfilezilla-ar \
locale-libfilezilla-az \
locale-libfilezilla-ca \
locale-libfilezilla-cs-CZ \
locale-libfilezilla-cy \
locale-libfilezilla-da \
locale-libfilezilla-de \
locale-libfilezilla-el \
locale-libfilezilla-es \
locale-libfilezilla-et \
locale-libfilezilla-eu \
locale-libfilezilla-fi-FI \
locale-libfilezilla-fr \
locale-libfilezilla-hr \
locale-libfilezilla-is \
locale-libfilezilla-it \
locale-libfilezilla-nb-NO \
locale-libfilezilla-ne \
locale-libfilezilla-nl \
locale-libfilezilla-nn-NO \
locale-libfilezilla-oc \
locale-libfilezilla-pl-PL \
locale-libfilezilla-pt-BR \
locale-libfilezilla-pt-PT \
locale-libfilezilla-ru \
locale-libfilezilla-sl-SI \
locale-libfilezilla-sr \
locale-libfilezilla-sv \
locale-libfilezilla-tr \
locale-libfilezilla-uk-UA \
locale-libfilezilla-zh-CN \
locale-libfilezilla-zh-TW"

RDEPENDS:${PN} += "libfilezilla"

inherit rpm
