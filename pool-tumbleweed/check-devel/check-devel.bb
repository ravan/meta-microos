SUMMARY = "Development files for the CHECK unit test framework"
DESCRIPTION = "Check is a unit test framework for C. It features a simple interface \
for defining unit tests, putting little in the way of the developer. \
Tests are run in a separate address space, so Check can catch both \
assertion failures and code errors that cause segmentation faults or \
other signals. The output from unit tests can be used within source \
code editors and IDEs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "check-devel-0.15.2-2.21.aarch64.rpm"
RPM_HASH = "541ec094aeeb75a702662a38e1d2e80d19d0874632f9419bd1ff8b149468463e4ebcc2fcea68ff9f766c324d54a4fe032f76d0c3cd2ca6172a273d5f2fd4c6ac"

RPROVIDES:${PN} += "check-devel \
pkgconfig-check"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcheck0"

inherit rpm
