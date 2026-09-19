SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.12"

RPM_NAME = "python314-python-crfsuite-0.9.12-1.6.aarch64.rpm"
RPM_HASH = "5b2460bde73a16ecd80043c1830fe63f20d607efc79116e80bf26c9d78b4c1f13d93c23375d509f26e307d3f2b72f21fc3cc8813444834c6e306377d1ee81c41"

RPROVIDES:${PN} += "python3.14dist-python-crfsuite \
python314-python-crfsuite \
python3dist-python-crfsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
