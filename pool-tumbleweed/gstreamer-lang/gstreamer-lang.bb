SUMMARY = "Translations for package gstreamer"
DESCRIPTION = "Provides translations for the 'gstreamer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-lang-1.28.7-1.1.noarch.rpm"
RPM_HASH = "eaf8c0739f38b89b864bd3498b381403bf19e38b9a1b7fc27853882c1b0a1c150f9cbac3405f05ab7940d84e69b6b4ee21f947f05e2344f2e49cba30d733a528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-lang \
gstreamer-lang-all \
locale-gstreamer-af \
locale-gstreamer-ar \
locale-gstreamer-ast \
locale-gstreamer-az \
locale-gstreamer-be \
locale-gstreamer-bg \
locale-gstreamer-ca \
locale-gstreamer-cs \
locale-gstreamer-da \
locale-gstreamer-de \
locale-gstreamer-el \
locale-gstreamer-en-GB \
locale-gstreamer-eo \
locale-gstreamer-es \
locale-gstreamer-eu \
locale-gstreamer-fi \
locale-gstreamer-fr \
locale-gstreamer-fur \
locale-gstreamer-gl \
locale-gstreamer-hr \
locale-gstreamer-hu \
locale-gstreamer-id \
locale-gstreamer-it \
locale-gstreamer-ja \
locale-gstreamer-ka \
locale-gstreamer-kk \
locale-gstreamer-ko \
locale-gstreamer-lt \
locale-gstreamer-lv \
locale-gstreamer-nb \
locale-gstreamer-nl \
locale-gstreamer-pl \
locale-gstreamer-pt-BR \
locale-gstreamer-ro \
locale-gstreamer-ru \
locale-gstreamer-sk \
locale-gstreamer-sl \
locale-gstreamer-sq \
locale-gstreamer-sr \
locale-gstreamer-sv \
locale-gstreamer-tr \
locale-gstreamer-uk \
locale-gstreamer-vi \
locale-gstreamer-zh-CN \
locale-gstreamer-zh-TW"

RDEPENDS:${PN} += "gstreamer"

inherit rpm
