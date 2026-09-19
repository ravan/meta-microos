SUMMARY = "Haskell tls profiling library"
DESCRIPTION = "This package provides the Haskell tls profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "ghc-tls-prof-2.4.3-1.3.aarch64.rpm"
RPM_HASH = "73a95ebc95f5b976006bb0f48c19adce9906056d453978a664eff525d4489a3ac93fdf472c72e227806a277698401fe1a741222bee3d3d70216c398b34a4fc29"

RPROVIDES:${PN} += "ghc-prof-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-tls-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-prof-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-prof-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-prof-crypton-x509-validation-1.9.1-A5KE59wkqBYCYMNBGaEl3l \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-ech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND \
ghc-prof-hpke-0.1.0-FWQ67GYIQQ2GKLielMsG9n \
ghc-prof-mlkem-0.2.1.0-I3LOwjV1LZnU6D8hY2Ok5 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-serialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-tls-devel"

inherit rpm
