SUMMARY = "Translations for package hourglass"
DESCRIPTION = "Provides translations for the 'hourglass' package."
LICENSE = "GPL-3.0-only"

PV = "3.1.1"

RPM_NAME = "hourglass-lang-3.1.1-1.4.noarch.rpm"
RPM_HASH = "eaa9cda93915efdb04c4fd142568335e6fea6c202a39ca2dfe3ccc16de76e1fe99c6a4575605200ead9e3b69661964396b77129b305b33d746e93bf2b7af4c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hourglass-lang \
hourglass-lang-all \
locale-hourglass-bs \
locale-hourglass-de \
locale-hourglass-es \
locale-hourglass-et \
locale-hourglass-fr \
locale-hourglass-it \
locale-hourglass-ja \
locale-hourglass-lt \
locale-hourglass-pt \
locale-hourglass-pt-BR \
locale-hourglass-ru \
locale-hourglass-sv \
locale-hourglass-tr"

RDEPENDS:${PN} += "hourglass"

inherit rpm
