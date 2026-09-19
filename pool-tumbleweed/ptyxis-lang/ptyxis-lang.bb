SUMMARY = "Translations for package ptyxis"
DESCRIPTION = "Provides translations for the 'ptyxis' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.1"

RPM_NAME = "ptyxis-lang-50.1-1.3.noarch.rpm"
RPM_HASH = "054b073e7aa7a19aac60c74f0b90b8852f9e9f82b26a8a300b6e67194a9471f30570f281f6f60fd5b4e81ce069d64e82d315556f2f7c9445e4678abb6928d604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ptyxis-be \
locale-ptyxis-bg \
locale-ptyxis-ca \
locale-ptyxis-cs \
locale-ptyxis-de \
locale-ptyxis-en-GB \
locale-ptyxis-es \
locale-ptyxis-eu \
locale-ptyxis-fa \
locale-ptyxis-fi \
locale-ptyxis-fr \
locale-ptyxis-he \
locale-ptyxis-hi \
locale-ptyxis-hu \
locale-ptyxis-id \
locale-ptyxis-it \
locale-ptyxis-ja \
locale-ptyxis-ka \
locale-ptyxis-kk \
locale-ptyxis-ko \
locale-ptyxis-nb \
locale-ptyxis-nl \
locale-ptyxis-oc \
locale-ptyxis-pt \
locale-ptyxis-pt-BR \
locale-ptyxis-ru \
locale-ptyxis-sl \
locale-ptyxis-sr \
locale-ptyxis-sv \
locale-ptyxis-th \
locale-ptyxis-tr \
locale-ptyxis-uk \
locale-ptyxis-zh-CN \
locale-ptyxis-zh-TW \
ptyxis-lang \
ptyxis-lang-all"

RDEPENDS:${PN} += "ptyxis"

inherit rpm
