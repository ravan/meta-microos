SUMMARY = "Translations for package libpurple-plugin-prpltwtr"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-prpltwtr' package."
LICENSE = "GPL-2.0+"

PV = "0.14.0"

RPM_NAME = "libpurple-plugin-prpltwtr-lang-0.14.0-2.9.noarch.rpm"
RPM_HASH = "1dd3af9026c406ac120c4f117b637fd4585076e4423ad443fa7bce383ca9600dd392e65ba09987a04b39a2728447c38d5fac27b8d28df4b2486d739ba6e5b53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-prpltwtr-lang \
libpurple-plugin-prpltwtr-lang-all \
locale-libpurple-plugin-prpltwtr-es \
locale-libpurple-plugin-prpltwtr-ja"

RDEPENDS:${PN} += "libpurple-plugin-prpltwtr"

inherit rpm
