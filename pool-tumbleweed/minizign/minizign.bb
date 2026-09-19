SUMMARY = "Minisign reimplemented in Zig"
DESCRIPTION = "A Zig implementation of Minisign. minizign supports signature verification, \
signing, and key generation."
LICENSE = "ISC"

PV = "0.1.7"

RPM_NAME = "minizign-0.1.7-1.3.aarch64.rpm"
RPM_HASH = "4a6c7f197b136ea3b9d33eef5df41bee99c0c9aa347b65f2d10f42fded56eb991d3c22a9b2bca1fc943a88b846d2f944dc00a0d531b48bd8dd62286f5fb23250"

RPROVIDES:${PN} += "minizign"

RDEPENDS:${PN} += ""

inherit rpm
