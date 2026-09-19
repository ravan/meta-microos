SUMMARY = "Haskell text-icu library development files"
DESCRIPTION = "This package provides the Haskell text-icu library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.5"

RPM_NAME = "ghc-text-icu-devel-0.8.0.5-3.3.aarch64.rpm"
RPM_HASH = "9714f77bd66f4d8455df12c9124d72e5ee887aabb33c67b34ae724132620ca87240582103474ad677e7f9eeb952ae91d27ac9e6e8d0fcfc3bb71c1a27f295c65"

RPROVIDES:${PN} += "ghc-devel-text-icu-0.8.0.5-3ASu5PNyjAiJW6A93Cqx8U \
ghc-text-icu-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-text-icu \
libicu-devel \
pkgconfig \
pkgconfig-icu-i18n \
pkgconfig-icu-io"

inherit rpm
