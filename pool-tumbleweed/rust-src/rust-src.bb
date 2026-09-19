SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.98.1"

RPM_NAME = "rust-src-1.98.1-1.1.aarch64.rpm"
RPM_HASH = "26a5c6c410f569e8197627ac85c196e70764615a5b1a652d094521970598af7c17f05f03f1fec7487419cca3113c6c486f770a7c2a326e373965dafc60180c09"

RPROVIDES:${PN} += "rust-src"

RDEPENDS:${PN} += "rust1.98-src"

inherit rpm
