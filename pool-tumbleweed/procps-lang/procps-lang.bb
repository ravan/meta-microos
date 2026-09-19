SUMMARY = "Translations for package procps"
DESCRIPTION = "Provides translations for the 'procps' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.7"

RPM_NAME = "procps-lang-4.0.7-2.1.noarch.rpm"
RPM_HASH = "50cf247469709ea6eb38cce8f1f4ca90140c3f548d55753df54e2b6bdbca1c7b39323b30cc8e85d0f0186936792544a506e8196e8d69f118ba197c0ddd16956c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-procps-de \
locale-procps-es \
locale-procps-fr \
locale-procps-ka \
locale-procps-ko \
locale-procps-pl \
locale-procps-pt-BR \
locale-procps-ro \
locale-procps-sv \
locale-procps-uk \
locale-procps-vi \
locale-procps-zh-CN \
procps-lang \
procps-lang-all"

RDEPENDS:${PN} += "procps"

inherit rpm
