SUMMARY = "Haskell hashable profiling library"
DESCRIPTION = "This package provides the Haskell hashable profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-hashable-prof-1.5.1.0-1.3.aarch64.rpm"
RPM_HASH = "1b8b0073718c6584c12d5439a1c5a43a56e16cecd9314084622c6c8e7e300b0eb4176988c113d036c7dfc30bacfe37acdb2ced15b5d2e7cfd022235c2a61ff0d"

RPROVIDES:${PN} += "ghc-hashable-prof \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr"

RDEPENDS:${PN} += "ghc-hashable-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
