SUMMARY = "Translations for package xournalpp"
DESCRIPTION = "Provides translations for the 'xournalpp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "xournalpp-lang-1.3.7-1.1.noarch.rpm"
RPM_HASH = "887dbacb32a68ff477722305136596bbb130030aa9e4ac2934261376ba9a5ee21f88ed9027521983477ab1b78844b2df6eb1ea5ad3fe05cda048ef1391568d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xournalpp-ar \
locale-xournalpp-ca \
locale-xournalpp-cs \
locale-xournalpp-da \
locale-xournalpp-de \
locale-xournalpp-el \
locale-xournalpp-en-GB \
locale-xournalpp-es \
locale-xournalpp-eu \
locale-xournalpp-fi \
locale-xournalpp-fr \
locale-xournalpp-gl \
locale-xournalpp-he \
locale-xournalpp-hi \
locale-xournalpp-hu \
locale-xournalpp-id \
locale-xournalpp-it \
locale-xournalpp-ja \
locale-xournalpp-ko \
locale-xournalpp-nl \
locale-xournalpp-pl \
locale-xournalpp-pt-BR \
locale-xournalpp-pt-PT \
locale-xournalpp-ro \
locale-xournalpp-ru \
locale-xournalpp-sl-SI \
locale-xournalpp-sv \
locale-xournalpp-th \
locale-xournalpp-tr \
locale-xournalpp-uk-UA \
locale-xournalpp-vi \
locale-xournalpp-zh \
locale-xournalpp-zh-HK \
locale-xournalpp-zh-TW \
xournalpp-lang \
xournalpp-lang-all"

RDEPENDS:${PN} += "xournalpp"

inherit rpm
