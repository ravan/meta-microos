SUMMARY = "Translations for package gcal"
DESCRIPTION = "Provides translations for the 'gcal' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1"

RPM_NAME = "gcal-lang-4.1-5.6.noarch.rpm"
RPM_HASH = "513c20e6cd4415726a1d250863580506750402cfb29abb9d9d78ee66873f6b9d7191a2e0029e29e5d83de7cd4aaa0e859c0469944efdf0751c5ef0239323a368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcal-lang \
gcal-lang-all \
locale-gcal-ca \
locale-gcal-da \
locale-gcal-de \
locale-gcal-es \
locale-gcal-fr \
locale-gcal-it \
locale-gcal-lt \
locale-gcal-nl \
locale-gcal-pl \
locale-gcal-ru \
locale-gcal-sv \
locale-gcal-tr \
locale-gcal-zh-CN"

RDEPENDS:${PN} += "gcal"

inherit rpm
