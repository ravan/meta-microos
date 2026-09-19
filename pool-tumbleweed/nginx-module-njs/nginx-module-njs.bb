SUMMARY = "NGINX module for NGINX Javascript"
DESCRIPTION = "njs is a subset of the JavaScript language that allows extending \
nginx functionality."
LICENSE = "BSD-2-Clause"

PV = "0.9.1"

RPM_NAME = "nginx-module-njs-0.9.1-1.20.aarch64.rpm"
RPM_HASH = "346ecd490cf27333134faee58dc076ffcd099a34d90f63e74aa687798752f8245a207f991c1833815db33b7283ecc32a118f19c6b952b4ea6adfae8bb7983c16"

RPROVIDES:${PN} += "nginx-module-njs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libxml2.so.16 \
nginx"

inherit rpm
