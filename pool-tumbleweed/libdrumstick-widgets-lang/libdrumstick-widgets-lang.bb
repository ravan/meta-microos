SUMMARY = "Translations for package libdrumstick-widgets"
DESCRIPTION = "Provides translations for the 'libdrumstick-widgets' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-widgets-lang-2.11.1-1.1.noarch.rpm"
RPM_HASH = "b988cec32bc103af16728ed030af51f9dee1791cdd7154ea8732e325f7630541265ddd78a6b7aa364c7053be567f8bfdd32efff03a8e76d58d1b9d0201b2758c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdrumstick-widgets-lang \
libdrumstick-widgets-lang-all"

RDEPENDS:${PN} += "libdrumstick-widgets"

inherit rpm
