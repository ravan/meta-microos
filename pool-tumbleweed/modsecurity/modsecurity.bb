SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "Apache-2.0"

PV = "3.0.15"

RPM_NAME = "modsecurity-3.0.15-2.3.aarch64.rpm"
RPM_HASH = "492d48f028188d73943fcacabe07efc139a27be9d3f350887c84c195a6cde57e773e0e3ede44218253527e0157bd5e8fbd5b61de6b4fb6095457443452e09eb1"

RPROVIDES:${PN} += "modsecurity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmodsecurity.so.3 \
libstdc++.so.6"

inherit rpm
