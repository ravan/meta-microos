SUMMARY = "Translations for package lutris"
DESCRIPTION = "Provides translations for the 'lutris' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.22"

RPM_NAME = "lutris-lang-0.5.22-2.2.noarch.rpm"
RPM_HASH = "21cc3b21f523da7c5178139f3746ec6af90c865c326e7e9ab107997c18a3f33a66b7265bcc921890176de76c10efa04086079bbde496d559127602631d8b1476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lutris-ar \
locale-lutris-be \
locale-lutris-de \
locale-lutris-el \
locale-lutris-es \
locale-lutris-fa \
locale-lutris-fi \
locale-lutris-fr \
locale-lutris-hr \
locale-lutris-it \
locale-lutris-ka \
locale-lutris-ko \
locale-lutris-nb \
locale-lutris-nl \
locale-lutris-pl \
locale-lutris-pt-BR \
locale-lutris-pt-PT \
locale-lutris-ru \
locale-lutris-tr \
locale-lutris-vi \
locale-lutris-zh-CN \
lutris-lang \
lutris-lang-all"

RDEPENDS:${PN} += "lutris"

inherit rpm
