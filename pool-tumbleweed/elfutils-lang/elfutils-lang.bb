SUMMARY = "Translations for package elfutils"
DESCRIPTION = "Provides translations for the 'elfutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "elfutils-lang-0.194-1.4.noarch.rpm"
RPM_HASH = "417798542b810828d6e5f716af047616ddaeeef0065ed91bf359d685462a9c4b033b06ea36a0a187cb764b38bc67875d6e7fc23c319a04f2757520316dda2228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elfutils-lang \
elfutils-lang-all \
locale-elfutils-de \
locale-elfutils-en@boldquot \
locale-elfutils-en@quot \
locale-elfutils-es \
locale-elfutils-ja \
locale-elfutils-pl \
locale-elfutils-uk"

RDEPENDS:${PN} += "elfutils"

inherit rpm
