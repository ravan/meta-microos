SUMMARY = "Haskell glib profiling library"
DESCRIPTION = "This package provides the Haskell glib profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-glib-prof-0.13.12.0-2.3.aarch64.rpm"
RPM_HASH = "b4a981f47de831da3d319cb25a08794971d934511cbdc123370e4e8b31e86ba983ddad74054339be35189f2724145b06634ec022a8bc13f0257efecf37937e87"

RPROVIDES:${PN} += "ghc-glib-prof \
ghc-prof-glib-0.13.12.0-ARZovtA2xnqKsDZ2Db5KU2"

RDEPENDS:${PN} += "ghc-glib-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
