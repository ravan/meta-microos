SUMMARY = "Translations for package mercurial"
DESCRIPTION = "Provides translations for the 'mercurial' package."
LICENSE = "GPL-2.0-or-later"

PV = "7.2.4"

RPM_NAME = "mercurial-lang-7.2.4-1.2.noarch.rpm"
RPM_HASH = "6051d58a79c13436c6d6e39c1cba4a6f072d53fce85f004e375ea1ebcc2d9940a3be1fc9c1cdaafa696cefe4883f303ae7bd418e9e42837e9daa8b2c3248f771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mercurial-da \
locale-mercurial-de \
locale-mercurial-el \
locale-mercurial-fr \
locale-mercurial-it \
locale-mercurial-ja \
locale-mercurial-pt-BR \
locale-mercurial-ro \
locale-mercurial-ru \
locale-mercurial-sv \
locale-mercurial-zh-CN \
locale-mercurial-zh-TW \
mercurial-lang \
mercurial-lang-all"

RDEPENDS:${PN} += "mercurial"

inherit rpm
