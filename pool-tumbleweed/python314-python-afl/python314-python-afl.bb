SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python314-python-afl-0.7.3-4.9.aarch64.rpm"
RPM_HASH = "acd37f37ba62c623bb213bef63c6571f4d30bfa37292509e8a495c3febe911f924868856c57cdcfd1e94d5c28b94602d497a45adad08cb08164726e7444890c9"

RPROVIDES:${PN} += "python3.14dist-python-afl \
python314-python-afl \
python3dist-python-afl"

RDEPENDS:${PN} += "/usr/bin/sh \
afl \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
