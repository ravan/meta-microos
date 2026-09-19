SUMMARY = "Command line interface for libeconf"
DESCRIPTION = "This package contains tools for handling configuration files in e.g. /usr/etc \
and /etc."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "libeconf-utils-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "824795bf3791cccc352fa403106e26fcba53d3f571d8fafba7f6b0bff18f9bdacbfe0195561ae88ea514e938c5449ae6fabe8a9f8af852e62766029f3edd3392"

RPROVIDES:${PN} += "libeconf-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libeconf0"

inherit rpm
