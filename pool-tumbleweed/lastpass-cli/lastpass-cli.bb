SUMMARY = "LastPass command line interface tool"
DESCRIPTION = "LastPass is a freemium password management service which stores encrypted \
passwords in the cloud. This package provides its command line interface \
tool."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "lastpass-cli-1.6.1-1.1.aarch64.rpm"
RPM_HASH = "687e1cec6ecefe38989d33e7565b6a89b57ccae0e68a22c8de0ab238eba0f67ed24137c64f0f2b75024e283aac3146d32e18efcbaf77d5804c087840ca792365"

RPROVIDES:${PN} += "lastpass-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
libxml2.so.16"

inherit rpm
