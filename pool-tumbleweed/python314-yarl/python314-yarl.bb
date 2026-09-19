SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.24.5"

RPM_NAME = "python314-yarl-1.24.5-1.1.aarch64.rpm"
RPM_HASH = "034c74ff29315c38b2ad93b0d6b08c95801f3a9c0dc129e3c55cde9b644541e23da5026cc0e99d01809057182e2cbefe518a2bd30a9fe7831c0929cb9979cb60"

RPROVIDES:${PN} += "python3.14dist-yarl \
python314-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-idna \
python314-multidict \
python314-propcache"

inherit rpm
