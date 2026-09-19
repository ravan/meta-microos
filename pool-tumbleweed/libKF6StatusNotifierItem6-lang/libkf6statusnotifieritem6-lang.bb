SUMMARY = "Translations for package libKF6StatusNotifierItem6"
DESCRIPTION = "Provides translations for the 'libKF6StatusNotifierItem6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6StatusNotifierItem6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "7b4f2dc5407f3315df8df8a6e4ad3af8659fc913f29138bef30628b6fcf95f9f5e45e8ca089a6dc7b11d7e8747172077af72843e177e9929db1d9417e5978445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6StatusNotifierItem6-lang \
libKF6StatusNotifierItem6-lang-all \
locale-libKF6StatusNotifierItem6-ar \
locale-libKF6StatusNotifierItem6-ast \
locale-libKF6StatusNotifierItem6-bg \
locale-libKF6StatusNotifierItem6-ca \
locale-libKF6StatusNotifierItem6-ca@valencia \
locale-libKF6StatusNotifierItem6-cs \
locale-libKF6StatusNotifierItem6-de \
locale-libKF6StatusNotifierItem6-en-GB \
locale-libKF6StatusNotifierItem6-eo \
locale-libKF6StatusNotifierItem6-es \
locale-libKF6StatusNotifierItem6-eu \
locale-libKF6StatusNotifierItem6-fi \
locale-libKF6StatusNotifierItem6-fr \
locale-libKF6StatusNotifierItem6-ga \
locale-libKF6StatusNotifierItem6-gl \
locale-libKF6StatusNotifierItem6-he \
locale-libKF6StatusNotifierItem6-hi \
locale-libKF6StatusNotifierItem6-hu \
locale-libKF6StatusNotifierItem6-ia \
locale-libKF6StatusNotifierItem6-is \
locale-libKF6StatusNotifierItem6-it \
locale-libKF6StatusNotifierItem6-ja \
locale-libKF6StatusNotifierItem6-ka \
locale-libKF6StatusNotifierItem6-ko \
locale-libKF6StatusNotifierItem6-lt \
locale-libKF6StatusNotifierItem6-lv \
locale-libKF6StatusNotifierItem6-nl \
locale-libKF6StatusNotifierItem6-nn \
locale-libKF6StatusNotifierItem6-pl \
locale-libKF6StatusNotifierItem6-pt-BR \
locale-libKF6StatusNotifierItem6-ro \
locale-libKF6StatusNotifierItem6-ru \
locale-libKF6StatusNotifierItem6-sk \
locale-libKF6StatusNotifierItem6-sl \
locale-libKF6StatusNotifierItem6-sv \
locale-libKF6StatusNotifierItem6-ta \
locale-libKF6StatusNotifierItem6-tr \
locale-libKF6StatusNotifierItem6-ug \
locale-libKF6StatusNotifierItem6-uk \
locale-libKF6StatusNotifierItem6-zh-CN \
locale-libKF6StatusNotifierItem6-zh-TW"

RDEPENDS:${PN} += "libKF6StatusNotifierItem6"

inherit rpm
