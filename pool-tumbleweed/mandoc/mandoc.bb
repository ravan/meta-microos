SUMMARY = "UNIX manpage compiler"
DESCRIPTION = "The mandoc manpage compiler toolset (formerly called 'mdocml') \
is a suite of tools compiling mdoc(7), the roff(7) macro language \
of choice for BSD manual pages, and man(7), the predominant \
historical language for UNIX manuals. \
 \
It includes a man(1) manual viewer and additional tools. \
For general information, see <http://mandoc.bsd.lv/>."
LICENSE = "ISC"

PV = "1.14.6"

RPM_NAME = "mandoc-1.14.6-7.4.aarch64.rpm"
RPM_HASH = "914a23c320d0d486523c1a4ec4adced63f0f87a33f34cb2f9d48cd50b3aa3a42fe4c73a0cd96f81eae58c8f93c79591292141e72096998aa23974fba7424f9e4"

RPROVIDES:${PN} += "man \
mandoc \
rpm-lua-mandoc \
soelim"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mandoc-bin \
soelim-common"

inherit rpm
