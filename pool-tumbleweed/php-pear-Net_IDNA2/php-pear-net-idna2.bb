SUMMARY = "PHP library for Punycode encoding and decoding"
DESCRIPTION = "The package provides a class which allows one to convert from and to \
internationalized domain names (RFC 3490). They can be used with \
various registries worldwide to be translated between their original \
(localized) form and their encoded form as it will be used in the DNS \
(Domain Name System)."
LICENSE = "LGPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "php-pear-Net_IDNA2-0.2.0-1.19.noarch.rpm"
RPM_HASH = "ca766528cf805c45a41a535dcbd88ec7e3c259ddf48f720c499860b4d4176572992825752c684abb07e7af99e65e72a44743b49fe1075995bb29ccebdc8f5a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-IDNA2 \
php5-pear-Net-IDNA2 \
php7-pear-Net-IDNA2"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
