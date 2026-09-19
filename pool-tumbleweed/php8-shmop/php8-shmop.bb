SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-shmop-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "2b8e7d1b6527de16d4e458cc40b8e0e2b55d5348e731aae0c62b96cef070f59ca3b107bc31bc081d1e6c129455c2ab24a9a5552aabed83401bb81ed262dd3269"

RPROVIDES:${PN} += "config-php8-shmop \
php-shmop \
php8-shmop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
