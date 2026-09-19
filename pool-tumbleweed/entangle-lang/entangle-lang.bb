SUMMARY = "Translations for package entangle"
DESCRIPTION = "Provides translations for the 'entangle' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-lang-3.0-3.2.noarch.rpm"
RPM_HASH = "2263ef6e6994497b732a9aab7a955962cc3ea5918ae2e5a0d1abcef026e6d7c9b81d07531b89af1e490d5bf17e5d441b019f958c6019d2bcffd70fb7fc8f8a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "entangle-lang \
entangle-lang-all \
locale-entangle-bg \
locale-entangle-ca \
locale-entangle-cs \
locale-entangle-de \
locale-entangle-en-GB \
locale-entangle-es \
locale-entangle-eu \
locale-entangle-fa \
locale-entangle-fr \
locale-entangle-he \
locale-entangle-hu \
locale-entangle-it \
locale-entangle-ja \
locale-entangle-nb-NO \
locale-entangle-nl \
locale-entangle-pl \
locale-entangle-pt-BR \
locale-entangle-sv \
locale-entangle-tr \
locale-entangle-uk \
locale-entangle-zh-CN \
locale-entangle-zh-TW"

RDEPENDS:${PN} += "entangle"

inherit rpm
