SUMMARY = "Haskell asn1-encoding library development files"
DESCRIPTION = "This package provides the Haskell asn1-encoding library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-devel-0.9.6-8.35.aarch64.rpm"
RPM_HASH = "cf8c554e8d81424d61532ca70355341d18ab9600d8dfef30f444e9d37d3c70b1eacb1a2d5ea43aa83c23da632f0e1c91e558bc642c7ea037470ad06fd185f7fe"

RPROVIDES:${PN} += "ghc-asn1-encoding-devel \
ghc-devel-asn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-encoding \
ghc-compiler \
ghc-devel-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o"

inherit rpm
