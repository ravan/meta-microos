SUMMARY = "Haskell crypton-x509 profiling library"
DESCRIPTION = "This package provides the Haskell crypton-x509 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "ghc-crypton-x509-prof-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "233db883f5ed799824ec6516459ecf30bd9eddf67461038a824027dbe89d79ee78d1b868dc42075f2de6b1338d4d68d294f0a4ee3ec8003c483a29900eb0e870"

RPROVIDES:${PN} += "ghc-crypton-x509-prof \
ghc-prof-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII"

RDEPENDS:${PN} += "ghc-crypton-x509-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-prof-crypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-prof-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
