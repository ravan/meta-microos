SUMMARY = "Network Socket Interface"
DESCRIPTION = "Net_Socket is a class interface to TCP sockets. It provides blocking \
and non-blocking operation, with different reading and writing modes \
(byte-wise, block-wise, line-wise and special formats like network \
byte-order ip addresses)."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "php-pear-Net_Socket-1.2.2-1.19.noarch.rpm"
RPM_HASH = "33c5bdfb7fa23bd385e436ac7b1cee506a5a996e178cab05fe65d878952d6aed43b28b2496c0f8fc6e47c9405973880221ba8d99b591045f040b163ea24a39f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-Socket \
php5-pear-Net-Socket \
php7-pear-Net-Socket"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
