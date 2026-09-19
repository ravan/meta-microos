SUMMARY = "Translations for package texi2html"
DESCRIPTION = "Provides translations for the 'texi2html' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "texi2html-lang-5.0-6.7.noarch.rpm"
RPM_HASH = "8dc6750cecf41fe49634b6dd8529d23637ebfb154b2bc3c0699606a91e622f77939af75b8c7ccd78d1c97a2d348204e385c71215e355bbedd5c8df3db8fb66b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texi2html-cs \
locale-texi2html-da \
locale-texi2html-de \
locale-texi2html-de-AT \
locale-texi2html-eo \
locale-texi2html-es \
locale-texi2html-fr \
locale-texi2html-he \
locale-texi2html-hr \
locale-texi2html-hu \
locale-texi2html-id \
locale-texi2html-it \
locale-texi2html-ja \
locale-texi2html-nb \
locale-texi2html-nl \
locale-texi2html-pl \
locale-texi2html-ro \
locale-texi2html-ru \
locale-texi2html-sv \
locale-texi2html-tr \
locale-texi2html-vi \
locale-texi2html-zh-CN \
locale-texi2html-zh-TW \
texi2html-lang \
texi2html-lang-all"

RDEPENDS:${PN} += "texi2html"

inherit rpm
