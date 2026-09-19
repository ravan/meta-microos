SUMMARY = "Translations for package netease-cloud-music-gtk"
DESCRIPTION = "Provides translations for the 'netease-cloud-music-gtk' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.4"

RPM_NAME = "netease-cloud-music-gtk-lang-2.5.4-1.2.noarch.rpm"
RPM_HASH = "41aada26c1b73dffbc0e4d65a3d912f80bc58b77af2ea89185363bdd45a829b6181ccea0c02442780cfa91f48506213009ce690d853fdb5d51a72f668284fbb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-netease-cloud-music-gtk-zh-CN \
netease-cloud-music-gtk-lang \
netease-cloud-music-gtk-lang-all"

RDEPENDS:${PN} += "netease-cloud-music-gtk"

inherit rpm
