SUMMARY = "Wyabdc RealPeople TTS audio collection of english words"
DESCRIPTION = "This package contains many wav files which can be used by StarDict to pronounce \
english words. Files originally come from wyabdc, http://www.zhimajie.net, \
thanks xiaozima."
LICENSE = "GPL-2.0+"

PV = "2.1.0"

RPM_NAME = "stardict-sounds-wyabdcrealpeopletts-2.1.0-15.25.noarch.rpm"
RPM_HASH = "07f89b203e1585ea3dde96e2117a1a710ffe7b147d1f6cb01558d1a1d6892ef7b3b3ed5d4e43fede18e36a22d078a0a1f170e27df0f6dd20b00b1f330d81e922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-stardict-en \
stardict-sounds-wyabdcrealpeopletts"

RDEPENDS:${PN} += ""

inherit rpm
