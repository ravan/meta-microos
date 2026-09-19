SUMMARY = "An implementation of Exchange ActiveSync protocol"
DESCRIPTION = "grommunio-sync is an implementation of the ActiveSync protocol which is \
used 'over-the-air' for multi-platform ActiveSync devices. Devices \
supported are including Windows Mobile, Android, iPhone, and Nokia. \
With grommunio-sync, many groupware servers can be connected and synced \
with these devices."
LICENSE = "AGPL-3.0-only"

PV = "2.2"

RPM_NAME = "grommunio-sync-2.2-1.4.noarch.rpm"
RPM_HASH = "0ae2d25a7529bbc1ac2bc520e65a96f65074e13928edc0bd1a52216bf32db1123d665804f4803d4be95f55d42562e096a7680254277a3ec26f17805594ed88f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grommunio-sync \
grommunio-sync \
group-grosync \
system-user-grosync \
user-grosync"

RDEPENDS:${PN} += "/usr/bin/sh \
gromox \
mapi-header-php \
php8-mbstring \
php8-mysql \
php8-pcntl \
php8-pdo \
php8-posix \
php8-redis \
php8-soap \
sysuser-shadow"

inherit rpm
