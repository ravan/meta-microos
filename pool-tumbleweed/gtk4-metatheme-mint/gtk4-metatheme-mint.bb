SUMMARY = "Mint Themes -- GTK+ 4 Support"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.3"

RPM_NAME = "gtk4-metatheme-mint-2.2.3-1.4.noarch.rpm"
RPM_HASH = "052b68ea09ab8fe59428623f36f095c08ac20b1c28aad54a0884741057dfa3c9f532c0cc834fdeb4f5e6c3102c23d2f0ff828cf37c6bbc7ac5ff963c4bf5c6ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-mint \
mint-themes-gtk4"

RDEPENDS:${PN} += "metatheme-mint-common"

inherit rpm
