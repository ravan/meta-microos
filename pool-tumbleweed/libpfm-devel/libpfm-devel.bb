SUMMARY = "Development library to encode performance events for perf_events interface"
DESCRIPTION = "This package provides development libraries and header files used to encode performance events for perf_events interface."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm-devel-4.13.0-2.8.aarch64.rpm"
RPM_HASH = "631a1a86e8a5a85aadcbd7c296b57e2433d8021c9699e1e56335fda86af657d7e864af2184cf84d82fe1d82dc7a98d0b5a027be15f2945c563ec7df576ce63e9"

RPROVIDES:${PN} += "libpfm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm4"

inherit rpm
