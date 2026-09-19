SUMMARY = "High-level C binding for ZeroMQ"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
This package contains key creation utility zmakecert."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "czmq-4.2.1-1.20.aarch64.rpm"
RPM_HASH = "93c5c09236143777b635b2be3a72df69c26a49c5650fa823a28bb4667eae8eaa264f863774dce14e085287d7ab46f898f05dbfb260a6915009bc7deb4387459d"

RPROVIDES:${PN} += "czmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libczmq.so.4"

inherit rpm
