SUMMARY = "Abstraction of various SASL mechanism responses"
DESCRIPTION = "Provides code to generate responses to common SASL mechanisms, including: \
  - Digest-MD5 \
  - CramMD5 \
  - Plain \
  - Anonymous \
  - Login (Pseudo mechanism)"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "php-pear-Auth_SASL-1.2.0-1.10.noarch.rpm"
RPM_HASH = "40c8b28f1ab97c187accbb0d21482fc63845bd1abe3a96f127af96c1d7493fb2395511eeaf6a3526fcb15f81a9e253fdc83493079c437fe90199a5a51d0de1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Auth-SASL \
php5-pear-Auth-SASL \
php7-pear-Auth-SASL"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
