SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.10"

RPM_NAME = "hlint-3.10-1.17.aarch64.rpm"
RPM_HASH = "70498ffd64b09a60c34addb132dd4eee062e7e377688b5825dcdbb9b2347e1ada1f756b673390f7e8ff727994c2ce473fee8c6a739e8280241a9fd5c28ae466b"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm
