SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python313-python-afl-0.7.3-4.9.aarch64.rpm"
RPM_HASH = "79b3e3f0b08392921fa1456a05035b6356e7e9b406519581dc5b72f1856801350b9116f57f69833fcc58f9e2dbb09696027c9c36e0cceff0838265d0d03cdc17"

RPROVIDES:${PN} += "python3-python-afl \
python3.13dist-python-afl \
python313-python-afl \
python3dist-python-afl"

RDEPENDS:${PN} += "/usr/bin/sh \
afl \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
