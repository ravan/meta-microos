SUMMARY = "Translations for package dar"
DESCRIPTION = "Provides translations for the 'dar' package."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.6"

RPM_NAME = "dar-lang-2.8.6-1.1.noarch.rpm"
RPM_HASH = "3ee16c769f1c294e127c02881b22b788a3d9ceef1960e6d321fdb982c2d820f596fc99b8b4ce334316abb41bf8e03c0d98a829cea0d9f902127afc7fba5643df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dar-lang \
dar-lang-all \
locale-dar-fr"

RDEPENDS:${PN} += "dar"

inherit rpm
