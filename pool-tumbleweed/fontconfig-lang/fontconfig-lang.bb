SUMMARY = "Translations for package fontconfig"
DESCRIPTION = "Provides translations for the 'fontconfig' package."
LICENSE = "MIT"

PV = "2.18.1"

RPM_NAME = "fontconfig-lang-2.18.1-1.3.noarch.rpm"
RPM_HASH = "5a9205605bc776796c23c1570b0397665b1647fb0639f1d1cd3d1c955a10c3c882260493d6963fb2730794f0dc10386dafe4a8b61cb2dd0d75f6aa4567bc2d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-lang \
fontconfig-lang-all \
locale-fontconfig-ka \
locale-fontconfig-zh-CN"

RDEPENDS:${PN} += "fontconfig"

inherit rpm
