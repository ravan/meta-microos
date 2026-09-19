SUMMARY = "Lua backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the Lua backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-lua-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "55f513c5041a24f911c5cd342dec58028cbd7e2aa9795723a2ebd095fd9b3a0726500a547c40b9766382e67fd765985f788e2a682a5fe3cea24f983a950b7976"

RPROVIDES:${PN} += "liblua2backend.so \
pdns-backend-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libstdc++.so.6 \
pdns"

inherit rpm
