SUMMARY = "MaxMind DB Apache Module"
DESCRIPTION = "This module allows you to query MaxMind DB files from Apache 2.2+ using the libmaxminddb library."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "apache2-mod_maxminddb-1.3.0-1.7.aarch64.rpm"
RPM_HASH = "778335a36e60dac56e2514b12a0380db8930c0f33c4bbd40ea081ca379b00342cac1e8831d063dee07f06bd78bf7f48dbcd0dc6b12c663a05194d848645eac55"

RPROVIDES:${PN} += "apache2-mod-maxminddb \
config-apache2-mod-maxminddb"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
suse-maintenance-mmn-0"

inherit rpm
