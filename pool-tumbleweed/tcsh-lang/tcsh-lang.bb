SUMMARY = "Translations for package tcsh"
DESCRIPTION = "Provides translations for the 'tcsh' package."
LICENSE = "BSD-3-Clause"

PV = "6.24.16"

RPM_NAME = "tcsh-lang-6.24.16-1.6.noarch.rpm"
RPM_HASH = "1f4d931b9f4d244917490ac5e5e1be027fe5d49add9fe4ae0ffdb86b843c2bac58beac887fc759f7fb2ac8a063c6155c02a90305edb51f8b52890f56d17acbb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tcsh-de \
locale-tcsh-el \
locale-tcsh-el-GR \
locale-tcsh-es \
locale-tcsh-et \
locale-tcsh-fi \
locale-tcsh-fr \
locale-tcsh-it \
locale-tcsh-ja \
locale-tcsh-pl \
locale-tcsh-ru-RU \
locale-tcsh-ru-UA.koi8u \
locale-tcsh-uk-UA \
tcsh-lang \
tcsh-lang-all"

RDEPENDS:${PN} += "tcsh"

inherit rpm
