SUMMARY = "HashLink library"
DESCRIPTION = "This subpackage provides the libhl library for HashLink."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libhl1-1.15-4.2.aarch64.rpm"
RPM_HASH = "33c649fff131982fe8b93b2dae47efbf49aae7089bbddc2fd521dd9c557cbd1d58ad1193968c7a4f6892c229bb0db1fe7484b6e3987669e84b7a0039eb2bae23"

RPROVIDES:${PN} += "libhl.so.1 \
libhl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
