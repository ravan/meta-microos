SUMMARY = "Library to read & write Dolby Vision metadata"
DESCRIPTION = "Library to read & write Dolby Vision metadata"
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "libdovi3-3.4.0-1.3.aarch64.rpm"
RPM_HASH = "ec8e6545698be24b45d72fff0a467b16f481233bf825c85925ea0b60413d59df59647905b310016a02610114fbbf18e2bcc42cbc5117e1536e0a511de02edb72"

RPROVIDES:${PN} += "libdovi.so.3 \
libdovi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
