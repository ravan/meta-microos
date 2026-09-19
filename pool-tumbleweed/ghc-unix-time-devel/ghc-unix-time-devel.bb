SUMMARY = "Haskell unix-time library development files"
DESCRIPTION = "This package provides the Haskell unix-time library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.17"

RPM_NAME = "ghc-unix-time-devel-0.4.17-1.8.aarch64.rpm"
RPM_HASH = "f0f7e84073fee40367c3b0edfcc868815ac2fcbbe05e6125a6bf687f540757d15a3ffb8be67cabdbcb84e4c3784efab883d4c847414f35076c3da48dc876b55a"

RPROVIDES:${PN} += "ghc-devel-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-unix-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-old-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX \
ghc-unix-time"

inherit rpm
