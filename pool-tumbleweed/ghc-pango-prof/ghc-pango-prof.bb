SUMMARY = "Haskell pango profiling library"
DESCRIPTION = "This package provides the Haskell pango profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-pango-prof-0.13.12.0-1.12.aarch64.rpm"
RPM_HASH = "aab7ce5640ef8c8b0016c3968aec2112c3339b480e2295289d770dc21d758c37b216ae3ab8310c7aecf84cab4e261aa76b9a9f0c382246bb6e26072f039ed589"

RPROVIDES:${PN} += "ghc-pango-prof \
ghc-prof-pango-0.13.12.0-EYXFDNPBrZO4dDymUfkqjN"

RDEPENDS:${PN} += "ghc-pango-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-cairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-glib-0.13.12.0-ARZovtA2xnqKsDZ2Db5KU2 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-text-2.1.4-cf23"

inherit rpm
