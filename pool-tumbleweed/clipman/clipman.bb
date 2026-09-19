SUMMARY = "A clipboard manager for Wayland"
DESCRIPTION = "A clipboard manager for Wayland with support for \
persisting copy buffers after an application exits."
LICENSE = "GPL-3.0-only"

PV = "1.6.5"

RPM_NAME = "clipman-1.6.5-1.7.aarch64.rpm"
RPM_HASH = "61b8a23492da7bc83fff0856245ae284bf0c71c8d571c6f69a6ee306b6de9ea52fbe48d5da1a8632778b49e5963c98e40de15f5505ac2f462717cfc7758a9ebc"

RPROVIDES:${PN} += "clipman"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
