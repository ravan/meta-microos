SUMMARY = "Haskell network-byte-order library development files"
DESCRIPTION = "This package provides the Haskell network-byte-order library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-network-byte-order-devel-0.1.8-1.2.aarch64.rpm"
RPM_HASH = "296676825c60de8a66a42c2377ea0c26ac54eb44f705c518ed5bc4381409eb635be6bf666c2097c56d632328305f056a57ea69a191c27321bb3240eb989b3968"

RPROVIDES:${PN} += "ghc-devel-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-network-byte-order-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-network-byte-order"

inherit rpm
