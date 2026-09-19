SUMMARY = "Config module for Icinga Web 2"
DESCRIPTION = "Director is an config module for icingaweb2"
LICENSE = "GPL-2.0-or-later"

PV = "1.11.9"

RPM_NAME = "icingaweb2-module-director-1.11.9-1.3.noarch.rpm"
RPM_HASH = "20d4f329d574270e76a49b4f71a22322ca89528eea23fe3fbc47ce00dce69e7cd6abe125afd6bd9cddb98ae5ccefa34ec35b0813a58321186999d6c41605d85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-icingaweb2 \
icingaweb2-module-director \
user-icingadirector"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
icinga-php-library \
icinga-php-thirdparty \
icinga2 \
icingaweb2 \
icingaweb2-module-incubator \
icingaweb2-module-ipl \
icingaweb2-module-reactbundle \
php \
php-curl \
php-iconv \
php-pcntl \
php-posix \
php-sockets \
pwdutils \
systemd"

inherit rpm
