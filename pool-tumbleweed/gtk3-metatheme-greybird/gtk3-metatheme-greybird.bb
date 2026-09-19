SUMMARY = "GTK+ 3 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 3 support of Greybird."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.4+git0.7e4507d"

RPM_NAME = "gtk3-metatheme-greybird-3.23.4+git0.7e4507d-1.5.noarch.rpm"
RPM_HASH = "fcdb45f7bfda44a6e2a6725f328c74298042b8d5f4a744cc772c160610ebba0b425b6a284479b7a88f1378946d1ddd6ef02b38636c52b98ad3c5cd4bbc7a8137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-greybird"

RDEPENDS:${PN} += "metatheme-greybird-common"

inherit rpm
