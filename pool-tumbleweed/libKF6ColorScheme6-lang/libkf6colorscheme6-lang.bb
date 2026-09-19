SUMMARY = "Translations for package libKF6ColorScheme6"
DESCRIPTION = "Provides translations for the 'libKF6ColorScheme6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ColorScheme6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "a2143b95304ea1e351b5c7bf8eb68dca66d34f4785a71a46d1787374d840dc52060242b71ae21b4f08d92d2a0a23ccc2a2476b8b80bf9cff3e1feac0b8f087f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6ColorScheme6-lang \
libKF6ColorScheme6-lang-all \
locale-libKF6ColorScheme6-ar \
locale-libKF6ColorScheme6-ast \
locale-libKF6ColorScheme6-be \
locale-libKF6ColorScheme6-bg \
locale-libKF6ColorScheme6-ca \
locale-libKF6ColorScheme6-ca@valencia \
locale-libKF6ColorScheme6-cs \
locale-libKF6ColorScheme6-de \
locale-libKF6ColorScheme6-en-GB \
locale-libKF6ColorScheme6-eo \
locale-libKF6ColorScheme6-es \
locale-libKF6ColorScheme6-eu \
locale-libKF6ColorScheme6-fa \
locale-libKF6ColorScheme6-fi \
locale-libKF6ColorScheme6-fr \
locale-libKF6ColorScheme6-ga \
locale-libKF6ColorScheme6-gl \
locale-libKF6ColorScheme6-he \
locale-libKF6ColorScheme6-hi \
locale-libKF6ColorScheme6-hu \
locale-libKF6ColorScheme6-ia \
locale-libKF6ColorScheme6-is \
locale-libKF6ColorScheme6-it \
locale-libKF6ColorScheme6-ja \
locale-libKF6ColorScheme6-ka \
locale-libKF6ColorScheme6-ko \
locale-libKF6ColorScheme6-lt \
locale-libKF6ColorScheme6-lv \
locale-libKF6ColorScheme6-nl \
locale-libKF6ColorScheme6-nn \
locale-libKF6ColorScheme6-pa \
locale-libKF6ColorScheme6-pl \
locale-libKF6ColorScheme6-pt-BR \
locale-libKF6ColorScheme6-ro \
locale-libKF6ColorScheme6-ru \
locale-libKF6ColorScheme6-sk \
locale-libKF6ColorScheme6-sl \
locale-libKF6ColorScheme6-sv \
locale-libKF6ColorScheme6-ta \
locale-libKF6ColorScheme6-tr \
locale-libKF6ColorScheme6-ug \
locale-libKF6ColorScheme6-uk \
locale-libKF6ColorScheme6-zh-CN \
locale-libKF6ColorScheme6-zh-TW"

RDEPENDS:${PN} += "libKF6ColorScheme6"

inherit rpm
