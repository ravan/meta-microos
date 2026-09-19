SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "python314-rpm-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "52f6f4bfe56984817bf44e3802bf403ad229af69c622323c7e7dc47feeefb54b5492845204b6f46f2a7b521f8ac2675b6d5753f53f2062d5a682ef81b12e79e2"

RPROVIDES:${PN} += "python3.14dist-rpm \
python314-rpm \
python3dist-rpm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.10 \
librpmbuild.so.10 \
librpmio.so.10 \
librpmsign.so.10 \
python-abi \
rpm"

inherit rpm
