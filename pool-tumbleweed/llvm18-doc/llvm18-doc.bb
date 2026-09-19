SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-doc-18.1.8-13.1.noarch.rpm"
RPM_HASH = "134deccae21a95e682b0b3011aac7ec996368fc5d9c09a6773e14f34681db9917201fa603ceb5e58f143d150242ec3fca8283ff2bdf12b1dc995b80a6b7470cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm18-doc"

RDEPENDS:${PN} += "llvm18"

inherit rpm
