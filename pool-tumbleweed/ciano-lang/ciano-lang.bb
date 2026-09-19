SUMMARY = "Translations for package ciano"
DESCRIPTION = "Provides translations for the 'ciano' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-lang-0.2.4-2.12.noarch.rpm"
RPM_HASH = "3d5af82a4d580936a343c2eff0e81fac769078e6be37c1b7fe318212ca5eff2d3d53d059a453ce114fc333a89f6de79ac39185e87275ba00d36262043524986b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ciano-lang \
ciano-lang-all \
locale-ciano-da \
locale-ciano-es \
locale-ciano-fr \
locale-ciano-lt \
locale-ciano-nl \
locale-ciano-pt \
locale-ciano-pt-BR \
locale-ciano-tr \
locale-ciano-zh-CN"

RDEPENDS:${PN} += "ciano"

inherit rpm
