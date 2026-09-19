SUMMARY = "Haskell extra library development files"
DESCRIPTION = "This package provides the Haskell extra library development files."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "ghc-extra-devel-1.8.1-1.7.aarch64.rpm"
RPM_HASH = "209e9a2479158a6b5816aacb97a55f69ed527fab8c05d70acc2cb9e73c3b82b9d375cb0b5ebc9aa7b5635793d2a3cdd68c7567ecc713c2ae65713e94d29b3eaa"

RPROVIDES:${PN} += "ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-clock-0.8.4-Jabd1gSnpD77RKirxFCoTK \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-extra"

inherit rpm
