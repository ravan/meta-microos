SUMMARY = "Haskell commonmark-pandoc library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-pandoc-doc-0.3-1.2.noarch.rpm"
RPM_HASH = "1e5cd837d3dd5ab3ea73327965848bda33620f95c80adba5f5dd41f42055c1f381714e2fcd5f7f323c73882be3800398b0f87bd9ed85ca073c7fb464c2e274dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
