SUMMARY = "ChaSen Perl Module"
DESCRIPTION = "ChaSen Perl Module"
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "perl-Text-ChaSen-2.4.5-4.8.aarch64.rpm"
RPM_HASH = "f75a04af4622c114fa8b5506f98c7b72a06217d79f85c6ffb55e86e7cf1fe288da90384f2b3893236b8fd2db7871bdca19ffa4c352ac2472f089c098761c57a6"

RPROVIDES:${PN} += "chasen-perl \
perl-Text--ChaSen \
perl-Text-ChaSen"

RDEPENDS:${PN} += "chasen \
libc.so.6 \
perl"

inherit rpm
