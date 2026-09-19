SUMMARY = "Development files for rocq-stdlib"
DESCRIPTION = "This package contains development files for the Rocq standard library."
LICENSE = "LGPL-2.1-only"

PV = "9.2.0"

RPM_NAME = "rocq-stdlib-devel-9.2.0-1.1.aarch64.rpm"
RPM_HASH = "40ff6e9e32813198bc17cfb4f4358535a8f0bf8636e70c31cd4c8af78d057529c08e1aaa367def11ea03c09a486159c4cee948a5e872d34211a269d97317827b"

RPROVIDES:${PN} += "coq-devel-/usr/lib64/coq/theories/Logic/Classical.v \
rocq-stdlib-devel"

RDEPENDS:${PN} += "rocq-stdlib"

inherit rpm
