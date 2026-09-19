SUMMARY = "Client script for connman"
DESCRIPTION = "Provides client interface for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-client-1.42-2.16.aarch64.rpm"
RPM_HASH = "df00fb12783fd9d67b02b0c91514dbc81905eb49caa2b40f3f589178f67b8b6d98b5340b743a249ebf09dab493ff27ba4637ac04ce4c497e036df70238ce6998"

RPROVIDES:${PN} += "connman-client"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libreadline.so.8"

inherit rpm
