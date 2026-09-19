SUMMARY = "Icinga CLI"
DESCRIPTION = "Icinga command line interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "icingacli-2.13.0-1.9.noarch.rpm"
RPM_HASH = "08efc9df157e3051219a89f59553677373563bbc43dd2f7026d06b14b7635088f0582c2339e80a5497ada38e950124c53ed60c5cd5807f8391b51b241fcb904e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingacli"

RDEPENDS:${PN} += "/usr/bin/php \
bash-completion \
icinga-l10n \
icingaweb2-common \
php-cli \
php-icinga"

inherit rpm
