SUMMARY = "Fully-threaded I/O benchmark program"
DESCRIPTION = "A simple multithreaded I/O benchmark, popular amongst kernel developers. \
The results tend to be realistic enough to have some bearing on real \
world results, while the tests are simple enough for kernel engineers to \
analyze changes ..."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "tiobench-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "26f68086609949734dba4065c8e3534aa9222ec423e0015c2b68dd3767077b16a7a9a33eca44ae26abbc1bb3ed57938df88a659162dae8fcbec691cce9b8decd"

RPROVIDES:${PN} += "tiobench"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
