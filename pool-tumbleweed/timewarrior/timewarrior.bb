SUMMARY = "Command line time tracker"
DESCRIPTION = "Timewarrior is a command line time tracking application, which allows you to \
record time spent on activities."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "timewarrior-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "43d5c82bba3bb3b920686932e39fd172f2189ce8a92d8fb65ae52b11a2987a7b89b05917c0910f332f492cad93a2c931db2e64755c137e86445758c3cc6072ee"

RPROVIDES:${PN} += "timewarrior"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
