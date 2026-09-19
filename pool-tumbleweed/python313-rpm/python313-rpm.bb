SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "python313-rpm-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "cc60c4e23a547ef3397a584f8dc2a68be781f3df389b5864a0ec7a55bbc1b772ac61f61ccce8f40b81543d1a28773ea4c85170d93dc70c31b8e62f8edaa2cbcc"

RPROVIDES:${PN} += "python3-rpm \
python3.13dist-rpm \
python313-rpm \
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
