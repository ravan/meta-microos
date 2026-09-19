SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "python314-augeas-1.2.0-1.10.aarch64.rpm"
RPM_HASH = "9c42f4a58cc56af76caaefc5fc335c58dafb9df09ad4d55aa6c8bb160c2faffd2b4008d275f8e698f31140c5c1f3b2439c61ad955fbe0f50a9f612de3d10328c"

RPROVIDES:${PN} += "python3.14dist-python-augeas \
python314-augeas \
python3dist-python-augeas"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
python-abi \
python314-cffi"

inherit rpm
