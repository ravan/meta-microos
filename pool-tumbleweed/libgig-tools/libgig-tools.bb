SUMMARY = "Example applications for libgig"
DESCRIPTION = "Some example applications for the libgig package. \
 \
* gigdump: demo app that prints out the content of a .gig file \
* gigextract: extracts samples from a .gig file \
* dlsdump: demo app that prints out the content of a DLS file \
* rifftree: tool that prints out the RIFF tree of an arbitrary RIFF file"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "libgig-tools-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "2a6cb0587237240cbe9a4299e7905b69ca378aa45e71391028633217d696c4dd6b40d6da9955737ac6a9599911628bd60ab080cfc3700aba5b0d1be9cd482fc7"

RPROVIDES:${PN} += "libgig-tools \
libgig6-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libakai.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgig.so.14 \
libgig14 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
