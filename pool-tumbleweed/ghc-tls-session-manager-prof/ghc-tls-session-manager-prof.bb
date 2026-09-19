SUMMARY = "Haskell tls-session-manager profiling library"
DESCRIPTION = "This package provides the Haskell tls-session-manager profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-tls-session-manager-prof-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "bb18ef9925931a1d1dbf89372b7f31677027367af95314feea91bbf47371e027c35f2fdf8288d26fde2c68179e89b6ae47e653d7c577b308ce2daa721b4596a0"

RPROVIDES:${PN} += "ghc-prof-tls-session-manager-0.1.0-A4BrlELQF3J5ui8eShhjSg \
ghc-tls-session-manager-prof"

RDEPENDS:${PN} += "ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-clock-0.8.4-Jabd1gSnpD77RKirxFCoTK \
ghc-prof-crypto-token-0.2.0-DtnqWEKcimRLBs2fTpfiGj \
ghc-prof-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-serialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7 \
ghc-prof-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-tls-session-manager-devel"

inherit rpm
