SUMMARY = "Translations for phonon-vlc plugin"
DESCRIPTION = "Provides translations for the 'phonon-vlc-qt5' packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "phonon-vlc-lang-0.12.0-2.13.noarch.rpm"
RPM_HASH = "d6a99004f82a15589ce980670bdb2ee721361aaba9ac112f6b388bd3d2cecc04edc6223d6098bb4f129ae0be0c5d764fe6ec697d7838d373a4c9df6674a5085c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phonon-vlc-az \
locale-phonon-vlc-bg \
locale-phonon-vlc-bs \
locale-phonon-vlc-ca \
locale-phonon-vlc-ca@valencia \
locale-phonon-vlc-cs \
locale-phonon-vlc-da \
locale-phonon-vlc-de \
locale-phonon-vlc-el \
locale-phonon-vlc-en-GB \
locale-phonon-vlc-eo \
locale-phonon-vlc-es \
locale-phonon-vlc-et \
locale-phonon-vlc-eu \
locale-phonon-vlc-fi \
locale-phonon-vlc-fr \
locale-phonon-vlc-ga \
locale-phonon-vlc-gl \
locale-phonon-vlc-hi \
locale-phonon-vlc-hu \
locale-phonon-vlc-ia \
locale-phonon-vlc-id \
locale-phonon-vlc-is \
locale-phonon-vlc-it \
locale-phonon-vlc-ja \
locale-phonon-vlc-ka \
locale-phonon-vlc-kk \
locale-phonon-vlc-ko \
locale-phonon-vlc-lt \
locale-phonon-vlc-mr \
locale-phonon-vlc-nb \
locale-phonon-vlc-nds \
locale-phonon-vlc-nl \
locale-phonon-vlc-nn \
locale-phonon-vlc-pa \
locale-phonon-vlc-pl \
locale-phonon-vlc-pt \
locale-phonon-vlc-pt-BR \
locale-phonon-vlc-ro \
locale-phonon-vlc-ru \
locale-phonon-vlc-sk \
locale-phonon-vlc-sl \
locale-phonon-vlc-sr \
locale-phonon-vlc-sr@ijekavian \
locale-phonon-vlc-sr@ijekavianlatin \
locale-phonon-vlc-sr@latin \
locale-phonon-vlc-sv \
locale-phonon-vlc-tr \
locale-phonon-vlc-ug \
locale-phonon-vlc-uk \
locale-phonon-vlc-vi \
locale-phonon-vlc-zh-CN \
locale-phonon-vlc-zh-TW \
phonon-vlc-lang \
phonon-vlc-qt5-lang-all \
phonon-vlc-qt6-lang-all \
phonon4qt5-backend-vlc-lang"

RDEPENDS:${PN} += ""

inherit rpm
