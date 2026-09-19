SUMMARY = "Translations for package DVDStyler"
DESCRIPTION = "Provides translations for the 'DVDStyler' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "DVDStyler-lang-3.2.1-5.4.noarch.rpm"
RPM_HASH = "4bb31b3e31e06eaa7a11b52dd0cf8365bfab577fc0950f5179608cd11c367b65d548b273a546ffd6a6d1fd9145c2649dd9c68b4464364736a8794688ec091b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "DVDStyler-lang \
DVDStyler-lang-all \
locale-DVDStyler-ar \
locale-DVDStyler-bg \
locale-DVDStyler-ca \
locale-DVDStyler-cs \
locale-DVDStyler-da \
locale-DVDStyler-de \
locale-DVDStyler-el \
locale-DVDStyler-es \
locale-DVDStyler-eu \
locale-DVDStyler-fi \
locale-DVDStyler-fr \
locale-DVDStyler-hu \
locale-DVDStyler-it \
locale-DVDStyler-ja \
locale-DVDStyler-ko \
locale-DVDStyler-mk \
locale-DVDStyler-nb \
locale-DVDStyler-nl \
locale-DVDStyler-pl \
locale-DVDStyler-pt \
locale-DVDStyler-pt-BR \
locale-DVDStyler-ro \
locale-DVDStyler-ru \
locale-DVDStyler-si \
locale-DVDStyler-sk \
locale-DVDStyler-sl \
locale-DVDStyler-sr \
locale-DVDStyler-sv \
locale-DVDStyler-tr \
locale-DVDStyler-uk \
locale-DVDStyler-vi \
locale-DVDStyler-zh-CN \
locale-DVDStyler-zh-TW"

RDEPENDS:${PN} += "DVDStyler"

inherit rpm
