SUMMARY = "Haskell asn1-parse library development files"
DESCRIPTION = "This package provides the Haskell asn1-parse library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-devel-0.9.5-6.24.aarch64.rpm"
RPM_HASH = "cff49e10adb77cfaa849dfb68bf9cd2c295eeb6acb5f58bbb7f8ab057d81d5b40a4d926a4f62f5f136cb33f883e9152ee42dc659fc381432724dd1964d660818"

RPROVIDES:${PN} += "ghc-asn1-parse-devel \
ghc-devel-asn1-parse-0.9.5-C3ZcAfeR9k34dM4BWjZOjb"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-parse \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI \
ghc-devel-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
