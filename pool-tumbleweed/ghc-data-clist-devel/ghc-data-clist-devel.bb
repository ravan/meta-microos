SUMMARY = "Haskell data-clist library development files"
DESCRIPTION = "This package provides the Haskell data-clist library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-devel-0.2-3.17.aarch64.rpm"
RPM_HASH = "fe168b825fa4c101578149c46c09c5fad7aef3950eba142d380513ff2881401e52026620043a8045cff2892175722c9c7d10285439a3b6093f3ae178f1a8aed9"

RPROVIDES:${PN} += "ghc-data-clist-devel \
ghc-devel-data-clist-0.2-JcMjkvVz4h0BOKvHWv3aRs"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-clist \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350"

inherit rpm
