SUMMARY = "Haskell crypton-asn1-parse library development files"
DESCRIPTION = "This package provides the Haskell crypton-asn1-parse library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "ghc-crypton-asn1-parse-devel-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "f15a7ff6e6933b5019f74711cfaf9b90697d3c3705ec2bf8f2ce4ef32a8a166c38c98f48d91c833792fe362334f704c6ad2c3b24ece8ee2d2c9c3537a7fcbf0b"

RPROVIDES:${PN} += "ghc-crypton-asn1-parse-devel \
ghc-devel-crypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-asn1-parse \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB"

inherit rpm
