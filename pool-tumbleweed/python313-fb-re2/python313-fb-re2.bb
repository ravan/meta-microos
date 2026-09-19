SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python313-fb-re2-1.0.7-7.1.aarch64.rpm"
RPM_HASH = "2651f8a94ef18e001e19b6faf3e366312ac491d598437b44dfe97e58a96b9c32564bd846b6bb374e7632a83606a5b118480acb60849468676840ee727a46316f"

RPROVIDES:${PN} += "python3-fb-re2 \
python3.13dist-fb-re2 \
python313-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
