SUMMARY = "Tools for Clang"
DESCRIPTION = "This package contains tools and scripts for using Clang, including: \
* bash completions for clang, \
* the clang-doc tool, \
* plugins for using clang-format, clang-include-fixer in vim and emacs. \
* scripts for using clang-format: git-clang-format and clang-format-diff, \
* scripts for using clang-tidy: run-clang-tidy and clang-tidy-diff, \
* scripts for using the Clang static analyzer: scan-build and scan-view, \
* a script for using find-all-symbols: run-find-all-symbols."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "clang-tools-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "ec216df3579ff71e6ade5957c0e68a6bdd02453d8837a627edc58fe8b6981662bffcb643d98b2ad1d02edddc1bb1a53d60b93b46a927fb72713fd30c8972beb6"

RPROVIDES:${PN} += "clang-tools \
emacs-llvm \
scan-build \
scan-view"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/perl \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libstdc++.so.6"

inherit rpm
