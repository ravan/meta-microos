SUMMARY = "Translations for package libtre5"
DESCRIPTION = "Provides translations for the 'libtre5' package."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "libtre5-lang-0.9.0-1.8.noarch.rpm"
RPM_HASH = "dcf370c7e8c38ec7d36b1ce5384c831d15ac9511fadda69456990da7f62d0736ffa99c78138e711d9dade95078b5c47413d27182272d75f310e4f49f2a380c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtre5-lang \
libtre5-lang-all \
locale-libtre5-fi \
locale-libtre5-sv \
locale-libtre5-zh-CN"

RDEPENDS:${PN} += "libtre5"

inherit rpm
