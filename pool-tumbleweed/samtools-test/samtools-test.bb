SUMMARY = "Test suite for samtools"
DESCRIPTION = "Test data and test runner for samtools. \
Run with: cp -a /usr/share/samtools/test/ /tmp/ && cd /tmp && ln -s /usr/bin/samtools . && ./test/test.pl"
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "samtools-test-1.21-2.1.aarch64.rpm"
RPM_HASH = "d023f8bb6aaf4715a3612e6c12f1df38ce8021420d3ffb3aaf11652ee9646974eade7f7e6970fabdda31fadb7d4f5ab53962fc60289d02853cb1af82abf82d30"

RPROVIDES:${PN} += "samtools-test"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhts.so.3 \
libz.so.1 \
perl \
samtools \
tabix"

inherit rpm
