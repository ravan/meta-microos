SUMMARY = "Build of mod_auth_mellon with diagnostic logging"
DESCRIPTION = "Build of mod_auth_mellon with diagnostic logging. See README.diagnostics \
in the doc directory for instructions on using the diagnostics build."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.1"

RPM_NAME = "apache2-mod_auth_mellon-diagnostics-0.19.1-1.9.aarch64.rpm"
RPM_HASH = "a0f54b5d3b4e191af80fbe63e39fb4ff565b9e4ada790b0d4d189bb23352eb5fc3b924641f0bc43ae9044c8674cb61a0c6dd561e122d9fc4b0da2e60862f835f"

RPROVIDES:${PN} += "apache2-mod-auth-mellon-diagnostics"

RDEPENDS:${PN} += "apache2-mod-auth-mellon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libglib-2.0.so.0 \
liblasso.so.3"

inherit rpm
