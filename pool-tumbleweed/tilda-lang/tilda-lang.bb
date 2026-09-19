SUMMARY = "Translations for package tilda"
DESCRIPTION = "Provides translations for the 'tilda' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "tilda-lang-2.0.0-1.10.noarch.rpm"
RPM_HASH = "b052273b219e90ea81af665a43dc45cfeea69b24bbb8507131d73bcad7304a79554aa2e34ccc26526bde5ea2ae7cf1199a9d664cf06da583cb8af083e4ecf97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tilda-bg \
locale-tilda-ca \
locale-tilda-cs \
locale-tilda-de \
locale-tilda-el \
locale-tilda-en-GB \
locale-tilda-es \
locale-tilda-fr \
locale-tilda-hr \
locale-tilda-hu \
locale-tilda-it \
locale-tilda-lt \
locale-tilda-nb \
locale-tilda-pl \
locale-tilda-pt \
locale-tilda-pt-BR \
locale-tilda-ru \
locale-tilda-sk \
locale-tilda-sl \
locale-tilda-sv \
locale-tilda-tr \
locale-tilda-uk \
locale-tilda-zh-CN \
locale-tilda-zh-TW \
tilda-lang \
tilda-lang-all"

RDEPENDS:${PN} += "tilda"

inherit rpm
