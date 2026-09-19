SUMMARY = "Haskell extra profiling library"
DESCRIPTION = "This package provides the Haskell extra profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "ghc-extra-prof-1.8.1-1.7.aarch64.rpm"
RPM_HASH = "df57ca6749428816fe2269773e396742dd5c19fb38d16911576f3495c1b1eb9ce1ca1d666877ab881565d7bba14bffd07b8884a7e45923c5c0ce7d8642493f4a"

RPROVIDES:${PN} += "ghc-extra-prof \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW"

RDEPENDS:${PN} += "ghc-extra-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-clock-0.8.4-Jabd1gSnpD77RKirxFCoTK \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
