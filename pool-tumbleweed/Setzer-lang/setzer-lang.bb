SUMMARY = "Translations for package Setzer"
DESCRIPTION = "Provides translations for the 'Setzer' package."
LICENSE = "GPL-3.0-or-later"

PV = "66"

RPM_NAME = "Setzer-lang-66-2.3.noarch.rpm"
RPM_HASH = "7f1e46905cab4525223588bfa661236e190e80a00082fea03d078309a60744ebcdeb123e928fc693a8720e3209f6339bbebae760f83e51189f42634fe41b2cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Setzer-lang \
Setzer-lang-all \
locale-Setzer-de \
locale-Setzer-es \
locale-Setzer-it \
locale-Setzer-pt-BR \
locale-Setzer-zh-CN"

RDEPENDS:${PN} += "Setzer"

inherit rpm
