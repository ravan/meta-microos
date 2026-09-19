SUMMARY = "Translations for package samba-winbind-libs"
DESCRIPTION = "Provides translations for the 'samba-winbind-libs' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-winbind-libs-lang-4.24.6+git.488.e38f6c96c62-1.1.noarch.rpm"
RPM_HASH = "59ff3932b2c470b5ab617844bdaf4f9b5a6cb864645303e2c45641ec3fd7fe42dd05b1b6d3d3f7b60b4fc187a9a0aa6ad98e8a9a89719a581c2f3c64fed752f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-samba-winbind-libs-ar \
locale-samba-winbind-libs-cs \
locale-samba-winbind-libs-da \
locale-samba-winbind-libs-de \
locale-samba-winbind-libs-es \
locale-samba-winbind-libs-fi \
locale-samba-winbind-libs-fr \
locale-samba-winbind-libs-hu \
locale-samba-winbind-libs-it \
locale-samba-winbind-libs-ja \
locale-samba-winbind-libs-ka \
locale-samba-winbind-libs-ko \
locale-samba-winbind-libs-nb \
locale-samba-winbind-libs-nl \
locale-samba-winbind-libs-pl \
locale-samba-winbind-libs-pt-BR \
locale-samba-winbind-libs-ru \
locale-samba-winbind-libs-sv \
locale-samba-winbind-libs-tr \
locale-samba-winbind-libs-zh-CN \
locale-samba-winbind-libs-zh-TW \
samba-winbind-libs-lang \
samba-winbind-libs-lang-all"

RDEPENDS:${PN} += "samba-winbind-libs"

inherit rpm
