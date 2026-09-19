SUMMARY = "An implementation of the SMTP protocol"
DESCRIPTION = "Provides an implementation of the SMTP protocol using PEAR's Net_Socket class."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "php-pear-Net_SMTP-1.12.2-1.3.noarch.rpm"
RPM_HASH = "352ab7ae968ed3510f1c86e9e3894a14ac3b5b41c899e8ee66b8aa4323cee2ef2d2966b5de384d66d31a4c7a76ec31637e5307448cb0c29aa24436846982ab5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-SMTP \
php5-pear-Net-SMTP \
php7-pear-Net-SMTP"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear \
php-pear-Net-Socket"

inherit rpm
