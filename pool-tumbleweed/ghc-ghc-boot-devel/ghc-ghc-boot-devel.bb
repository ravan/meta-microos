SUMMARY = "Haskell ghc-boot library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot library development files."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-boot-devel-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "0cc53f0cfe053b37992377319ab776e359798b661576872187e0cf3b98c6aba0fd5906861e8fd8475bb90f94424dca4738a1ad0068f667b03d1945679feb0183"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-9.12.4-a5b3 \
ghc-ghc-boot-devel \
ghc-ghc-boot-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-boot-th-9.12.4-0605 \
ghc-devel-ghc-platform-0.1.0.0-ac24 \
ghc-devel-unix-2.8.8.0-178a \
ghc-ghc-boot"

inherit rpm
