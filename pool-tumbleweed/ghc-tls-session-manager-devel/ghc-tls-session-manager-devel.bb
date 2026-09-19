SUMMARY = "Haskell tls-session-manager library development files"
DESCRIPTION = "This package provides the Haskell tls-session-manager library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-tls-session-manager-devel-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "e3f0e4b9597dce214a5e01f78c7e9ad7316bd06f7135971f6fd79040dc705fe7ee058891062c5ab4e3b70726c35b0f11bfdaebbda4f11a6a23da6427f934824f"

RPROVIDES:${PN} += "ghc-devel-tls-session-manager-0.1.0-A4BrlELQF3J5ui8eShhjSg \
ghc-tls-session-manager-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-clock-0.8.4-Jabd1gSnpD77RKirxFCoTK \
ghc-devel-crypto-token-0.2.0-DtnqWEKcimRLBs2fTpfiGj \
ghc-devel-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-serialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7 \
ghc-devel-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-tls-session-manager"

inherit rpm
