SUMMARY = "Haskell crypto-pubkey-types library development files"
DESCRIPTION = "This package provides the Haskell crypto-pubkey-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-crypto-pubkey-types-devel-0.4.3-1.25.aarch64.rpm"
RPM_HASH = "b8db2090d32c97b394722192245820c24ebef6d8fd4220d046614d7c6378381b453cb3d3dd70ce3af5aad6fad2bf92c22d1c2c6c913039a68c553eb3ba63b421"

RPROVIDES:${PN} += "ghc-crypto-pubkey-types-devel \
ghc-devel-crypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-pubkey-types \
ghc-devel-asn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI \
ghc-devel-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
