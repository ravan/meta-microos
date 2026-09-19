SUMMARY = "Haskell setenv library development files"
DESCRIPTION = "This package provides the Haskell setenv library development files."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-devel-0.1.1.3-12.23.aarch64.rpm"
RPM_HASH = "2f561548f7b052dba1d069aa75d57f744b2eb51903bd129ad009d83cbe9b1b220026076eae160ed2875e06f5b9745d6f5e1ed407562b9b86b94d6989c784fb42"

RPROVIDES:${PN} += "ghc-devel-setenv-0.1.1.3-DGkCIo7XRqzD68Dz6COumh \
ghc-setenv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-unix-2.8.8.0-178a \
ghc-setenv"

inherit rpm
