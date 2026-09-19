SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "cpupower-lang-7.2.5-14.14.noarch.rpm"
RPM_HASH = "45d9e9f2185c42fc3c4b29cd68ba88374dd787d338ecdeef878f6d478f47e1a509cd92349c074d68c6dc85798e321932a1659822712f32f10a536c1646300fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-lang \
cpupower-lang-all \
locale-cpupower-cs \
locale-cpupower-de \
locale-cpupower-fr \
locale-cpupower-it \
locale-cpupower-ka \
locale-cpupower-pt \
locale-cpupower-zh-CN"

RDEPENDS:${PN} += "cpupower"

inherit rpm
