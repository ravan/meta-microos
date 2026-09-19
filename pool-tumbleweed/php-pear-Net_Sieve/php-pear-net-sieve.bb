SUMMARY = "PHP module for talking to a sieve server"
DESCRIPTION = "This package provides an API to talk to servers implementing the managesieve protocol. It can be used to install and remove sieve scripts, mark them active etc."
LICENSE = "BSD-2-Clause"

PV = "1.4.8"

RPM_NAME = "php-pear-Net_Sieve-1.4.8-1.3.noarch.rpm"
RPM_HASH = "773e9f3dde8778c53d1449ca653d6fb0415154b4593bed09b3ea240721b326343cca8ea1aabb0e04b981282df59871dfed109e9ef0bad626530de4335af790ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-Sieve \
php5-pear-Net-Sieve \
php7-pear-Net-Sieve"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear \
php-pear-Net-Socket"

inherit rpm
