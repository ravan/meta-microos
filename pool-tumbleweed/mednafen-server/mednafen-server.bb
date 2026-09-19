SUMMARY = "Mednafen network play server"
DESCRIPTION = "Network play server for mednafen"
LICENSE = "GPL-2.0-only"

PV = "0.5.2"

RPM_NAME = "mednafen-server-0.5.2-10.10.aarch64.rpm"
RPM_HASH = "c0a7a98db47e2fbba1925fdcdcd953579caa9eaa0bd9610584c3220679aa59f4fd51af43b5b616e566f4d0d72506dd768d9ad8d16d217e8372bcbdf7441b4abd"

RPROVIDES:${PN} += "config-mednafen-server \
mednafen-server \
user-mednafen"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
shadow"

inherit rpm
