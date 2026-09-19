SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-modules-perl-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "5a512ecde3201f67e45ec0e9fd80106d25773112a2f82a104e4dd62a388d8b5a3d910d1af5fd8d30c52348ba0833ce4e8f7fe69cbc1f90200099037d99e1110d"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
