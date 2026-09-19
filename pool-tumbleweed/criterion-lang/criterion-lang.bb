SUMMARY = "Translations for package criterion"
DESCRIPTION = "Provides translations for the 'criterion' package."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "criterion-lang-2.4.3-1.5.noarch.rpm"
RPM_HASH = "7033c5b2377200ba0df4aa42b867c1d2b173aa8f6823cee5703c9ba0ea46245526dd66944b869450c151e261ae4c7e1df31f5e7580bb96af342b9f7505deee81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "criterion-lang \
criterion-lang-all \
locale-criterion-de \
locale-criterion-fr"

RDEPENDS:${PN} += "criterion"

inherit rpm
