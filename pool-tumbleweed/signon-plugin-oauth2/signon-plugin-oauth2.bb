SUMMARY = "Oauth2 plugin for the Single Sign On Framework"
DESCRIPTION = "This package contains the Oauth2 plugin for the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25git.20231124T142245~fab6988"

RPM_NAME = "signon-plugin-oauth2-0.25git.20231124T142245~fab6988-1.9.aarch64.rpm"
RPM_HASH = "1990beb18d7065a25d550035e2e7e10115f0eba2b07f1639c36ed6abed427d68db62f7fd4cdbd1b261fd7db9a841c945d3abeee25920753cf21c5d7d50bd5842"

RPROVIDES:${PN} += "liboauth2plugin.so \
signon-plugin-oauth2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libsignon-plugins.so.1 \
libstdc++.so.6 \
signon-ui"

inherit rpm
