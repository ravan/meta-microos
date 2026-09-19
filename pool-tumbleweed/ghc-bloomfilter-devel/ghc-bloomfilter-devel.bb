SUMMARY = "Haskell bloomfilter library development files"
DESCRIPTION = "This package provides the Haskell bloomfilter library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.3"

RPM_NAME = "ghc-bloomfilter-devel-2.0.1.3-1.7.aarch64.rpm"
RPM_HASH = "8d5c5cc6ea557d4a22e972cc66f62fe5db0a3e6750d52fc25b83649848351c9e44d4c48197547a73ca2fa5ac2ef43cefbe91921afea75a0c38820c22404a7415"

RPROVIDES:${PN} += "ghc-bloomfilter-devel \
ghc-devel-bloomfilter-2.0.1.3-6WqEF5kyWs0ITGKrOkkdRL"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bloomfilter \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350"

inherit rpm
