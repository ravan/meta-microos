SUMMARY = "Haskell skylighting-core library development files"
DESCRIPTION = "This package provides the Haskell skylighting-core library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.14.7"

RPM_NAME = "ghc-skylighting-core-devel-0.14.7-1.13.aarch64.rpm"
RPM_HASH = "3e16471d6b1149b45b01bce825ea5318624d87bed7043f75146d238d51f400481793693acaffd0f08c595ceb33255f8a6d18778f500da8c07d79fc9eac951786"

RPROVIDES:${PN} += "ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-skylighting-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-skylighting-core"

inherit rpm
