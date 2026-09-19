SUMMARY = "Icinga Web"
DESCRIPTION = "Lightweight and extensible web interface to tackle your monitoring challenge."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "icingaweb2-2.13.0-1.9.noarch.rpm"
RPM_HASH = "e1f9c9c59ef83e3a5a129b8cad5194d6fdf9adf977e9f3c8d7a452ff0c21f6dcb54073e8d7af6e98b78916eba88f22b1321a2aa22dcb4cb43b423db0bc167145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icingaweb2 \
group-icingacmd \
icingaweb2"

RDEPENDS:${PN} += "/usr/bin/sh \
apache2 \
icinga-l10n \
icingacli \
icingaweb2-common \
icingaweb2-module-monitoring \
php-icinga"

inherit rpm
