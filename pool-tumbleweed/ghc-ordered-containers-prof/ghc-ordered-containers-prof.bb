SUMMARY = "Haskell ordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell ordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-ordered-containers-prof-0.2.4-1.25.aarch64.rpm"
RPM_HASH = "debb99631bd35d7231d31d44211c0dac3e02f80ff4e117310e93535677a61fd00b59d7077204202335b39a355344b2afe61889debc6c081ae1396fb73e3dc808"

RPROVIDES:${PN} += "ghc-ordered-containers-prof \
ghc-prof-ordered-containers-0.2.4-AerqY0uBw917ksiEkklhVb"

RDEPENDS:${PN} += "ghc-ordered-containers-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr"

inherit rpm
