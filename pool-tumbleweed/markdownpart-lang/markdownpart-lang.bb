SUMMARY = "Translations for package markdownpart"
DESCRIPTION = "Provides translations for the 'markdownpart' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "markdownpart-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "43f93b194a0b81f27923931ba3db2322300c2dcc2bded52413999ed2aaae441363203f826a9e15b74fb00be5a0dcf8b78431960af07e6d7ddf6b363404039289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-markdownpart-ar \
locale-markdownpart-ast \
locale-markdownpart-ca \
locale-markdownpart-ca@valencia \
locale-markdownpart-cs \
locale-markdownpart-de \
locale-markdownpart-el \
locale-markdownpart-en-GB \
locale-markdownpart-eo \
locale-markdownpart-es \
locale-markdownpart-et \
locale-markdownpart-eu \
locale-markdownpart-fi \
locale-markdownpart-fr \
locale-markdownpart-ga \
locale-markdownpart-gl \
locale-markdownpart-he \
locale-markdownpart-hi \
locale-markdownpart-hu \
locale-markdownpart-ia \
locale-markdownpart-is \
locale-markdownpart-it \
locale-markdownpart-ja \
locale-markdownpart-ka \
locale-markdownpart-ko \
locale-markdownpart-lt \
locale-markdownpart-lv \
locale-markdownpart-nl \
locale-markdownpart-nn \
locale-markdownpart-pl \
locale-markdownpart-pt \
locale-markdownpart-pt-BR \
locale-markdownpart-ro \
locale-markdownpart-ru \
locale-markdownpart-sk \
locale-markdownpart-sl \
locale-markdownpart-sv \
locale-markdownpart-tr \
locale-markdownpart-ug \
locale-markdownpart-uk \
locale-markdownpart-vi \
locale-markdownpart-zh-CN \
locale-markdownpart-zh-TW \
markdownpart-lang \
markdownpart-lang-all"

RDEPENDS:${PN} += "markdownpart"

inherit rpm
