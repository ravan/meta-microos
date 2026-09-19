SUMMARY = "Haskell th-orphans profiling library"
DESCRIPTION = "This package provides the Haskell th-orphans profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.17"

RPM_NAME = "ghc-th-orphans-prof-0.13.17-1.3.aarch64.rpm"
RPM_HASH = "99cae7203c9d4119ce08ad97d48057a0a724aa94f0c1543243c14df11d62e9fd45e1f18dbf632d502e77cc9689513d1ce690aae3479011e228fd2c30d19dc505"

RPROVIDES:${PN} += "ghc-prof-th-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2 \
ghc-th-orphans-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp \
ghc-prof-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-prof-th-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x \
ghc-th-orphans-devel"

inherit rpm
