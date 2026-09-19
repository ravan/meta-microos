SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python314-fb-re2-1.0.7-7.1.aarch64.rpm"
RPM_HASH = "9d0e5f4bd2c972400be0def451781352fb37bf03f698167e1d98a5627d4903df7da30b9f5cdda7051822cb5318dc44bb328fb57dfa560ce7e51763c715000b33"

RPROVIDES:${PN} += "python3.14dist-fb-re2 \
python314-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
