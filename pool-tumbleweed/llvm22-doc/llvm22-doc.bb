SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-doc-22.1.8-3.2.noarch.rpm"
RPM_HASH = "fcc49653c5ff54f3c5425d55209b453b46bff91a5a20077118977749713359e0baae0bd0732a13dd5c7b3f1ea0eddaa5fad4924d2fb7cc1efab6226316a94a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm22-doc"

RDEPENDS:${PN} += "llvm22"

inherit rpm
