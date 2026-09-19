SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-opt-viewer-19.1.7-14.3.noarch.rpm"
RPM_HASH = "e7b7aa1c0e808c28fed5c92eccdbe29a2b15a9ae187dc15e1bb4cd9eb8916cbe44e6ea59e99fa7eac5bf1949124db9ce4be96f5ac45fd1709d40e1e7d7fad6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm19-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
