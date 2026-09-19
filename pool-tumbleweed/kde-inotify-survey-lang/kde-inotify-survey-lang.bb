SUMMARY = "Translations for package kde-inotify-survey"
DESCRIPTION = "Provides translations for the 'kde-inotify-survey' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kde-inotify-survey-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b809b5aced5b805bc16b1437101f69ccb056c751e372789a7c92222debb60c0757d6606806a6e2786ea6c16a5feb4055e4417deb2c2ea3dbf6d5317e36e98f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-inotify-survey-lang \
kde-inotify-survey-lang-all \
locale-kde-inotify-survey-ar \
locale-kde-inotify-survey-ast \
locale-kde-inotify-survey-ca \
locale-kde-inotify-survey-ca@valencia \
locale-kde-inotify-survey-cs \
locale-kde-inotify-survey-de \
locale-kde-inotify-survey-en-GB \
locale-kde-inotify-survey-eo \
locale-kde-inotify-survey-es \
locale-kde-inotify-survey-eu \
locale-kde-inotify-survey-fi \
locale-kde-inotify-survey-fr \
locale-kde-inotify-survey-ga \
locale-kde-inotify-survey-gl \
locale-kde-inotify-survey-he \
locale-kde-inotify-survey-hi \
locale-kde-inotify-survey-hu \
locale-kde-inotify-survey-ia \
locale-kde-inotify-survey-id \
locale-kde-inotify-survey-it \
locale-kde-inotify-survey-ja \
locale-kde-inotify-survey-ka \
locale-kde-inotify-survey-ko \
locale-kde-inotify-survey-lt \
locale-kde-inotify-survey-lv \
locale-kde-inotify-survey-nl \
locale-kde-inotify-survey-nn \
locale-kde-inotify-survey-pl \
locale-kde-inotify-survey-pt \
locale-kde-inotify-survey-pt-BR \
locale-kde-inotify-survey-ro \
locale-kde-inotify-survey-ru \
locale-kde-inotify-survey-sk \
locale-kde-inotify-survey-sl \
locale-kde-inotify-survey-sv \
locale-kde-inotify-survey-tr \
locale-kde-inotify-survey-ug \
locale-kde-inotify-survey-uk \
locale-kde-inotify-survey-zh-CN \
locale-kde-inotify-survey-zh-TW"

RDEPENDS:${PN} += "kde-inotify-survey"

inherit rpm
