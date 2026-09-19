SUMMARY = "Haskell echo library development files"
DESCRIPTION = "This package provides the Haskell echo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-devel-0.1.4-2.23.aarch64.rpm"
RPM_HASH = "fd76a1be5ed6e5b435dad2e4b9bbe1ba6158dc52f920e8d4b85298ebd44ff9635a80b33a5bc181e01ae616dda18b26c02265aa552ab1d8b7efdba40c1712a615"

RPROVIDES:${PN} += "ghc-devel-echo-0.1.4-2JVioXINDaCEoYt7R5FuJ9 \
ghc-echo-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-process-1.6.26.1-905d \
ghc-echo"

inherit rpm
