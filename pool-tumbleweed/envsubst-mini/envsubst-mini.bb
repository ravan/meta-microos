SUMMARY = "Environment substitution helper binary"
DESCRIPTION = "This package contains the envsubst helper binary to replace values from the \
environment."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "envsubst-mini-1.0-2.4.aarch64.rpm"
RPM_HASH = "fb33a5088831a6058c3bc80ce902a1a340301092454c1e921cf923b13d740f9f05a729374ff86878c2fa6383ab62d6cfc65cf507ce3fdc0f4f2cbbb0c995761d"

RPROVIDES:${PN} += "envsubst-mini"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
this-is-only-for-build-envs"

inherit rpm
