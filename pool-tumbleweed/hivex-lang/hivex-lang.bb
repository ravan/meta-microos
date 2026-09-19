SUMMARY = "Translations for package hivex"
DESCRIPTION = "Provides translations for the 'hivex' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "hivex-lang-1.3.24-3.3.noarch.rpm"
RPM_HASH = "014b2841f2f7991e01f4ee4b991b09e2d4b9a5f72b8ba85067182a59389f5e045c8ba413501944e176d42e5d934d74526260476e40c837e67dbfb2f155d7278d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hivex-lang \
hivex-lang-all \
locale-hivex-ca \
locale-hivex-cs \
locale-hivex-de \
locale-hivex-es \
locale-hivex-eu \
locale-hivex-fr \
locale-hivex-gu \
locale-hivex-hi \
locale-hivex-hu \
locale-hivex-ja \
locale-hivex-ka \
locale-hivex-kn \
locale-hivex-ml \
locale-hivex-mr \
locale-hivex-nl \
locale-hivex-or \
locale-hivex-pl \
locale-hivex-pt \
locale-hivex-pt-BR \
locale-hivex-ru \
locale-hivex-si \
locale-hivex-sr \
locale-hivex-uk \
locale-hivex-zh-CN"

RDEPENDS:${PN} += "hivex"

inherit rpm
