SUMMARY = "InterNetNews development files"
DESCRIPTION = "Rich Salz's InterNetNews news transport system. \
 \
This package contains the files needed to develop software depending on \
inn."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-devel-2.6.5-4.2.aarch64.rpm"
RPM_HASH = "b585e1585bc81816c03e07fcc07827c68f26e0ab220068705b14dddf0910649eba5d0d14f5a00ff388039bfd58f8dfca66c3f406dc1a38f9d5e18f55a12bdfb5"

RPROVIDES:${PN} += "inn-devel"

RDEPENDS:${PN} += "bison \
gdbm-devel \
inn \
pam-devel \
zlib-devel"

inherit rpm
