SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-lang-261.2-1.2.noarch.rpm"
RPM_HASH = "4bd11eb59554a9d3165a2900371c5a302064221352ada7dba3c9340b7b93f572dc5c229d8538025b807d836b7b197c90e49ddc9f1895efab9b81ae44a13e6aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-systemd-ar \
locale-systemd-be \
locale-systemd-be@latin \
locale-systemd-bg \
locale-systemd-ca \
locale-systemd-cs \
locale-systemd-da \
locale-systemd-de \
locale-systemd-el \
locale-systemd-eo \
locale-systemd-es \
locale-systemd-et \
locale-systemd-eu \
locale-systemd-fi \
locale-systemd-fr \
locale-systemd-gl \
locale-systemd-he \
locale-systemd-hi \
locale-systemd-hr \
locale-systemd-hu \
locale-systemd-ia \
locale-systemd-id \
locale-systemd-it \
locale-systemd-ja \
locale-systemd-ka \
locale-systemd-kk \
locale-systemd-km \
locale-systemd-kn \
locale-systemd-ko \
locale-systemd-lt \
locale-systemd-nb-NO \
locale-systemd-nl \
locale-systemd-pa \
locale-systemd-pl \
locale-systemd-pt \
locale-systemd-pt-BR \
locale-systemd-ro \
locale-systemd-ru \
locale-systemd-si \
locale-systemd-sk \
locale-systemd-sl \
locale-systemd-sr \
locale-systemd-sr@latin \
locale-systemd-sv \
locale-systemd-tr \
locale-systemd-ug \
locale-systemd-uk \
locale-systemd-zh-CN \
locale-systemd-zh-TW \
systemd-lang \
systemd-lang-all"

RDEPENDS:${PN} += "systemd"

inherit rpm
