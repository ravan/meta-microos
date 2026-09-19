SUMMARY = "Translations for package zvbi"
DESCRIPTION = "Provides translations for the 'zvbi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.45"

RPM_NAME = "zvbi-lang-0.2.45-1.1.noarch.rpm"
RPM_HASH = "0b7be681fe59256c480e9cf7b73612195479456aece7e16777343e1171845b10f033a0ede4e971e9d216278f3142970f32b54e2d7ba8a1ee945d58995640f3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zvbi-de \
locale-zvbi-en@boldquot \
locale-zvbi-en@quot \
locale-zvbi-es \
locale-zvbi-fr \
locale-zvbi-it \
locale-zvbi-ka \
locale-zvbi-nl \
locale-zvbi-pl \
zvbi-lang \
zvbi-lang-all"

RDEPENDS:${PN} += "zvbi"

inherit rpm
