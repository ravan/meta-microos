SUMMARY = "Default configuration for reporting bugs to openSUSE Bugzilla"
DESCRIPTION = "Default configuration for reporting bugs to openSUSE Bugzilla used to easily \
configure the reporting process for Red Hat systems. Just install this package \
and you're done."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-opensuse-bugzilla-2.17.15-1.13.noarch.rpm"
RPM_HASH = "c42a9c1e3a58f4447a853e3f8517fadcf0a0aed319057a4a833e9fb7785c675571315ba203765c1883db6a562ae6002b467b2f3f317da9528b37ae0c4e176296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libreport-opensuse-bugzilla \
libreport-opensuse-bugzilla"

RDEPENDS:${PN} += "libreport-2 \
libreport-plugin-bugzilla \
libreport-plugin-ureport"

inherit rpm
