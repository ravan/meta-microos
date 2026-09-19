SUMMARY = "Web client for access to grommunio features from the web"
DESCRIPTION = "A web client written in PHP that makes use of HTML5, JSON and ExtJS \
to allow users to make full use of grommunio through a web browser."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only & LGPL-2.1-only & MIT"

PV = "3.14"

RPM_NAME = "grommunio-web-3.14-1.9.noarch.rpm"
RPM_HASH = "db6d0e7d35793ef32e87f7a7e048882ced38bd7516c57ef67b77151c99c2485c1cf275331cdeef4e45f21f9743c0f4d9e15b672e3f8cc7aa27d233c926b96ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grommunio-web \
grommunio-web"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
gromox \
group-groweb \
mapi-header-php \
php8-bcmath \
php8-ctype \
php8-curl \
php8-dom \
php8-gd \
php8-gettext \
php8-iconv \
php8-mbstring \
php8-openssl \
php8-sodium \
php8-sqlite \
php8-sysvshm \
php8-zip \
php8-zlib \
user-groweb"

inherit rpm
