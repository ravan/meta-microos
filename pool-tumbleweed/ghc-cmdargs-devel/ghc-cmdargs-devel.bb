SUMMARY = "Haskell cmdargs library development files"
DESCRIPTION = "This package provides the Haskell cmdargs library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-devel-0.10.22-1.35.aarch64.rpm"
RPM_HASH = "48cb6f8715bcff68961080838d36d48962027378060358fb3760be709d1874e18f50e561a58c4fda9a9a289b78aa3920ecf03ca5eae3448a158b5c721aaeb576"

RPROVIDES:${PN} += "ghc-cmdargs-devel \
ghc-devel-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cmdargs \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
