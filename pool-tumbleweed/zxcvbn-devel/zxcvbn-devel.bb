SUMMARY = "Development files for zxcvbn"
DESCRIPTION = "The zxcvbn-devel package contains libraries and header files for \
developing applications that use zxcvbn"
LICENSE = "MIT"

PV = "2.5"

RPM_NAME = "zxcvbn-devel-2.5-3.7.aarch64.rpm"
RPM_HASH = "918e937d6e33f582700e58a3f95a63bdf0e54b1c650b17e48f2b9989e317584fdeaad5165a1f646e69b0734e9c26bfc1aa8794cf394ac3e8a8131546a4cc7772"

RPROVIDES:${PN} += "zxcvbn-devel"

RDEPENDS:${PN} += "libzxcvbn0"

inherit rpm
