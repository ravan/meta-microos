SUMMARY = "Translations for package libKPim6MimeTreeParserCore6"
DESCRIPTION = "Provides translations for the 'libKPim6MimeTreeParserCore6' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MimeTreeParserCore6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0ee90862d18aa8c22aa2613dc4619e966b2c08da183fb4dffde1550fd6b4fdc88cc9cfe394c20daa1249e3e4cca105a98957ef100c15ca5dac05e6689c2c6a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim6MimeTreeParserCore6-lang \
libKPim6MimeTreeParserCore6-lang-all \
locale-libKPim6MimeTreeParserCore6-ar \
locale-libKPim6MimeTreeParserCore6-ast \
locale-libKPim6MimeTreeParserCore6-ca \
locale-libKPim6MimeTreeParserCore6-ca@valencia \
locale-libKPim6MimeTreeParserCore6-cs \
locale-libKPim6MimeTreeParserCore6-de \
locale-libKPim6MimeTreeParserCore6-en-GB \
locale-libKPim6MimeTreeParserCore6-eo \
locale-libKPim6MimeTreeParserCore6-es \
locale-libKPim6MimeTreeParserCore6-eu \
locale-libKPim6MimeTreeParserCore6-fi \
locale-libKPim6MimeTreeParserCore6-fr \
locale-libKPim6MimeTreeParserCore6-ga \
locale-libKPim6MimeTreeParserCore6-gl \
locale-libKPim6MimeTreeParserCore6-he \
locale-libKPim6MimeTreeParserCore6-hi \
locale-libKPim6MimeTreeParserCore6-hu \
locale-libKPim6MimeTreeParserCore6-ia \
locale-libKPim6MimeTreeParserCore6-it \
locale-libKPim6MimeTreeParserCore6-ja \
locale-libKPim6MimeTreeParserCore6-ka \
locale-libKPim6MimeTreeParserCore6-ko \
locale-libKPim6MimeTreeParserCore6-lt \
locale-libKPim6MimeTreeParserCore6-lv \
locale-libKPim6MimeTreeParserCore6-nl \
locale-libKPim6MimeTreeParserCore6-pl \
locale-libKPim6MimeTreeParserCore6-pt-BR \
locale-libKPim6MimeTreeParserCore6-ru \
locale-libKPim6MimeTreeParserCore6-sk \
locale-libKPim6MimeTreeParserCore6-sl \
locale-libKPim6MimeTreeParserCore6-sv \
locale-libKPim6MimeTreeParserCore6-tr \
locale-libKPim6MimeTreeParserCore6-ug \
locale-libKPim6MimeTreeParserCore6-uk \
locale-libKPim6MimeTreeParserCore6-zh-CN \
locale-libKPim6MimeTreeParserCore6-zh-TW"

RDEPENDS:${PN} += "libKPim6MimeTreeParserCore6"

inherit rpm
