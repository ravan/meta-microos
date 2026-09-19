SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-opt-viewer-18.1.8-13.1.noarch.rpm"
RPM_HASH = "27ce6b7457bad429737f4d9de256a0bb348acb72509f4c090e745344f453ccc6bb33bf678367aee9c3a03aae711750272acaeb1603bdb682541f938c20f510a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm18-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
