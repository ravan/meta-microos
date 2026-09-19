SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "python313-pycares-5.0.1-1.5.aarch64.rpm"
RPM_HASH = "cfc8e7412286b94b2ebeba7ba5540fa32d0bf8f056c6cdb48e95c35306f982ca7792e4af5cb56aceb8583e6dcc4c900aa0ed2a8caae26ea942b8e2581c74e9e7"

RPROVIDES:${PN} += "python3-pycares \
python3.13dist-pycares \
python313-pycares \
python3dist-pycares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
python-abi \
python313-cffi"

inherit rpm
