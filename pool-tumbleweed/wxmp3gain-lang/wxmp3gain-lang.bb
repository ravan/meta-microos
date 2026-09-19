SUMMARY = "Translations for package wxmp3gain"
DESCRIPTION = "Provides translations for the 'wxmp3gain' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-lang-4.0-3.9.noarch.rpm"
RPM_HASH = "28f9f0770b9125a85fa9df1646b1082e051adbe1ebd95e827a485389abe6645bfb77f7d3227f0a87e5f1e6740e292ceb48584e7f7eed18764a0a73735038c0d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxmp3gain-lang \
wxmp3gain-lang-all"

RDEPENDS:${PN} += "wxmp3gain"

inherit rpm
