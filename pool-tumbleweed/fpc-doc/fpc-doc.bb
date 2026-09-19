SUMMARY = "Freepascal Compiler documentation"
DESCRIPTION = "The fpc-doc package contains the documentation PDF files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-doc-3.2.2-5.14.aarch64.rpm"
RPM_HASH = "75420dc04125d71c9b5b6f4b0622e7b6597d39efbdfc4bb71beae2b25725d200f7448afffec6c3e639b62acc01deecdf5831c4524952352465e7613c83570d6e"

RPROVIDES:${PN} += "fpc-doc"

RDEPENDS:${PN} += "binutils"

inherit rpm
