SUMMARY = "Haskell byteable profiling library"
DESCRIPTION = "This package provides the Haskell byteable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-prof-0.1.1-12.19.aarch64.rpm"
RPM_HASH = "e3c3e6afb37a03886c828551464a79ea777ee6aa38eb414abac1bbb9271be088090129adf4882937ad2a36a784b7be34752683b2292a1a547b723bff903ae374"

RPROVIDES:${PN} += "ghc-byteable-prof \
ghc-prof-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo"

RDEPENDS:${PN} += "ghc-byteable-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
