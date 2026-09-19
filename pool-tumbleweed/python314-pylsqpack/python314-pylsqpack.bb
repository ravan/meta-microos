SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.24"

RPM_NAME = "python314-pylsqpack-0.3.24-1.4.aarch64.rpm"
RPM_HASH = "ac9b607fca77fc42545a72c11fb2dee0987b9ba939a3c5827a228e9f1f99ecbd960e49540fa6665a95b660304eae0e32bfddc12fab262231ec53e50c9a231996"

RPROVIDES:${PN} += "python3.14dist-pylsqpack \
python314-pylsqpack \
python3dist-pylsqpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
