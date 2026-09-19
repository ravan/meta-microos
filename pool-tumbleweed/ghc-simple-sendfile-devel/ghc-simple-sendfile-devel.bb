SUMMARY = "Haskell simple-sendfile library development files"
DESCRIPTION = "This package provides the Haskell simple-sendfile library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-devel-0.2.32-1.27.aarch64.rpm"
RPM_HASH = "32657fac47abc9fad04943c312352ec0ed9d19cddb2456dac1ffcbf6ba3a6026d2c06632d003ce09ecd9e9ef7a502c52c44ab39cc0553574c95a98bad2f474e0"

RPROVIDES:${PN} += "ghc-devel-simple-sendfile-0.2.32-1TxnJXytdne4UoBrRdi39p \
ghc-simple-sendfile-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-unix-2.8.8.0-178a \
ghc-simple-sendfile"

inherit rpm
