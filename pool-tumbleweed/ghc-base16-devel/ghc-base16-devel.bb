SUMMARY = "Haskell base16 library development files"
DESCRIPTION = "This package provides the Haskell base16 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-base16-devel-1.0-1.3.aarch64.rpm"
RPM_HASH = "60c41bded2ba5bc1d8e4a9085ee030377ac765b33506ab526c8a618a06eeaaa57a804a0f454ca6e28f25509db216d185dd193dc9ec16cf39c796fca37b57a62f"

RPROVIDES:${PN} += "ghc-base16-devel \
ghc-devel-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base16 \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq"

inherit rpm
