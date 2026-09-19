SUMMARY = "A library for reading ebook files"
DESCRIPTION = "ebook-tools provides some tools to handle ebook files."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ebook-tools-0.2.2-9.8.aarch64.rpm"
RPM_HASH = "a9848a0332c8d8b15185fe294bb9d6a59bdee709633ec578e77a6ed5bfc2941ed349470ade3738507603fc9b5bf66c38e1289337902caa8246db4ef15bd3c7c6"

RPROVIDES:${PN} += "ebook-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libepub.so.0"

inherit rpm
