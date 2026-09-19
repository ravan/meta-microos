SUMMARY = "CalDAV and CardDAV implementation for grommunio"
DESCRIPTION = "grommunio-dav is a CalDAV and CardDAV implementation for grommunio."
LICENSE = "AGPL-3.0-only"

PV = "1.5"

RPM_NAME = "grommunio-dav-1.5-1.4.noarch.rpm"
RPM_HASH = "d0d0ffdc4bc8c78f1cc3cda19d4a7dd145f2e3ca0d7b370c66984c7ae8569aac036c30c056fd022dfa3b3ec630781f668318aee41444420ea3be22b57424500a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grommunio-dav \
grommunio-dav \
group-grodav \
system-user-grodav \
user-grodav"

RDEPENDS:${PN} += "/usr/bin/sh \
gromox \
mapi-header-php \
php8-ctype \
php8-curl \
php8-dom \
php8-iconv \
php8-mbstring \
php8-sqlite \
php8-xmlreader \
php8-xmlwriter \
sysuser-shadow"

inherit rpm
