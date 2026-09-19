SUMMARY = "PHP Extension Module"
DESCRIPTION = "Phalcon is a framework for PHP8 written as a C extension. \
Zephir is a high-level language, something between C and PHP. It is \
both dynamic and static typed and it supports the features we need to \
create and maintain a project like Phalcon."
LICENSE = "BSD-3-Clause"

PV = "5.16.0"

RPM_NAME = "php8-phalcon-5.16.0-1.2.aarch64.rpm"
RPM_HASH = "6d8395a26f3e741965c9c7d6d95ff5596044c070123a8d4a37b98dfd999aeebdcac1f10d57524841737073866d44c65631e3a590ba50b33be85de201c29dee94"

RPROVIDES:${PN} += "config-php8-phalcon \
php8-phalcon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php8-mysql"

inherit rpm
