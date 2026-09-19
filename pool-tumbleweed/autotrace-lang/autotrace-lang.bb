SUMMARY = "Translations for package autotrace"
DESCRIPTION = "Provides translations for the 'autotrace' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.10"

RPM_NAME = "autotrace-lang-0.31.10-1.7.noarch.rpm"
RPM_HASH = "0c4f8d61642396e86ebfc3ccf326258bb0e6ef7f2e09a31fd43b0216972d5f8d5c2a85195e4d2cf765855e59ed0c92a00378322bbefffa900616df35d8af1de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autotrace-lang \
autotrace-lang-all \
locale-autotrace-de \
locale-autotrace-ja"

RDEPENDS:${PN} += "autotrace"

inherit rpm
