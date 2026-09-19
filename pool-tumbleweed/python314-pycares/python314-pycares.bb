SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "python314-pycares-5.0.1-1.5.aarch64.rpm"
RPM_HASH = "b41f4b187a9011e1cad5d5f77e7dc6d803ac5da0e4ac5d0ef52b415bde590340df5c07ee90a95e4fc60e2200454924486fa98006722676391934c53a1d291270"

RPROVIDES:${PN} += "python3.14dist-pycares \
python314-pycares \
python3dist-pycares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
python-abi \
python314-cffi"

inherit rpm
