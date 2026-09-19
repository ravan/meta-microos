SUMMARY = "Translations for package fntsample"
DESCRIPTION = "Provides translations for the 'fntsample' package."
LICENSE = "CC-PDDC & GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "fntsample-lang-5.4-1.11.noarch.rpm"
RPM_HASH = "3a390af4a743b9e19d84189706eb9d6a13e3baac402ed9758f7904c72926f8ac027d8081a8683dce1d0aaa742ad54c5aea6415100e4e759ff594a8a922216fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fntsample-lang \
fntsample-lang-all \
locale-fntsample-uk"

RDEPENDS:${PN} += "fntsample"

inherit rpm
