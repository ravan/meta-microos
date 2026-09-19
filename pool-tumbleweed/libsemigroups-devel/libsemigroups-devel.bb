SUMMARY = "Development files for the Semigroups library"
DESCRIPTION = "A C++14 library containing implementations of several algorithms for \
computing finite and finitely presented semigroups, namely. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.6.1"

RPM_NAME = "libsemigroups-devel-3.6.1-1.3.aarch64.rpm"
RPM_HASH = "a9683d03bdcd6a50b72313f5d81cddf340397bdf496ba7a77bde778a79c03ff82af1cc6d3ab52718dba986063ac45b87d297db702af99eb2937aa4a88c09de45"

RPROVIDES:${PN} += "libsemigroups-devel \
pkgconfig-libsemigroups"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemigroups3 \
pkgconfig-eigen3 \
pkgconfig-fmt"

inherit rpm
