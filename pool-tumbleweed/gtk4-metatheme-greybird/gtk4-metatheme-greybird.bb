SUMMARY = "GTK+ 3 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 4 support of Greybird"
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.4+git0.7e4507d"

RPM_NAME = "gtk4-metatheme-greybird-3.23.4+git0.7e4507d-1.5.noarch.rpm"
RPM_HASH = "b94e9dfceed20b882125eb5f0295e2e951f255093368b264806a6fff22281594de1e4041f7dc92547ee71582a0d4f253ad302d6b4482f8b01f7735d8c453a9bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-greybird"

RDEPENDS:${PN} += "metatheme-greybird-common"

inherit rpm
