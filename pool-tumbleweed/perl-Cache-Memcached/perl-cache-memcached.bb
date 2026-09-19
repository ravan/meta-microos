SUMMARY = "Client library for memcached (memory cache daemon)"
DESCRIPTION = "This is the Perl API for memcached, a distributed memory cache daemon. More \
information is available at: \
 \
  http://www.danga.com/memcached/"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.300.0"

RPM_NAME = "perl-Cache-Memcached-1.300.0-1.7.noarch.rpm"
RPM_HASH = "c4ecfa986db04ea1f29b0c4704ba37758e9ca927b24fb5eae5d952aa2245c6bb0c65d9227e2889d74a151e7c467bce14449e93a9fd418a9368786708c97d5783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--Memcached \
perl-Cache--Memcached--GetParser \
perl-Cache-Memcached"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-String--CRC32"

inherit rpm
