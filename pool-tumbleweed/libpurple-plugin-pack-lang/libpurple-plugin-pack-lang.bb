SUMMARY = "Translations for package libpurple-plugin-pack"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-pack' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "libpurple-plugin-pack-lang-2.8.0-2.3.noarch.rpm"
RPM_HASH = "a87a3e9eb43af4a48bca4ea9573fc264f8d44550a0b4f7d41e30e1f9ab6ed1d19f1b73e6382cbd55050f920a531cb47c40d6fbcda34a3a0c599a5b8a8175916b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-pack-lang \
libpurple-plugin-pack-lang-all \
locale-libpurple-plugin-pack-de \
locale-libpurple-plugin-pack-en-AU \
locale-libpurple-plugin-pack-es-ES \
locale-libpurple-plugin-pack-fr \
locale-libpurple-plugin-pack-vi"

RDEPENDS:${PN} += "libpurple-plugin-pack"

inherit rpm
