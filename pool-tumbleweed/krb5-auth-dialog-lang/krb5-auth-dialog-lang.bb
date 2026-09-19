SUMMARY = "Translations for package krb5-auth-dialog"
DESCRIPTION = "Provides translations for the 'krb5-auth-dialog' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.alpha1"

RPM_NAME = "krb5-auth-dialog-lang-44.0.alpha1-1.11.noarch.rpm"
RPM_HASH = "6f1af24ae1aaee8256448a12325a1cbea43226cb39d4c635cae6ca78b08cdec2a178653d5c00cd3017c73babf372c1663b6b434b3d72e4209a0e6c3334c13dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krb5-auth-dialog-lang \
krb5-auth-dialog-lang-all \
locale-krb5-auth-dialog-bs \
locale-krb5-auth-dialog-cs \
locale-krb5-auth-dialog-da \
locale-krb5-auth-dialog-de \
locale-krb5-auth-dialog-el \
locale-krb5-auth-dialog-es \
locale-krb5-auth-dialog-eu \
locale-krb5-auth-dialog-fi \
locale-krb5-auth-dialog-fr \
locale-krb5-auth-dialog-gl \
locale-krb5-auth-dialog-hu \
locale-krb5-auth-dialog-id \
locale-krb5-auth-dialog-nb \
locale-krb5-auth-dialog-pa \
locale-krb5-auth-dialog-pl \
locale-krb5-auth-dialog-pt \
locale-krb5-auth-dialog-pt-BR \
locale-krb5-auth-dialog-ro \
locale-krb5-auth-dialog-sl \
locale-krb5-auth-dialog-sr \
locale-krb5-auth-dialog-sr@latin \
locale-krb5-auth-dialog-sv \
locale-krb5-auth-dialog-tr \
locale-krb5-auth-dialog-uk \
locale-krb5-auth-dialog-zh-CN \
locale-krb5-auth-dialog-zh-HK \
locale-krb5-auth-dialog-zh-TW"

RDEPENDS:${PN} += "krb5-auth-dialog"

inherit rpm
