SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_1-1-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "20733272fe3788810fe428ec91f1d322b99c875be73431860e2a1b16e3f0a9fd1dca972ce8a51104013c1d59c9407d784cda3636463612adbb6c155b2d5b5c0d"

RPROVIDES:${PN} += "libtolua++-5-1-1 \
libtolua++-5.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libm.so.6"

inherit rpm
