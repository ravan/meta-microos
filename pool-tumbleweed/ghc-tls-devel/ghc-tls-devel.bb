SUMMARY = "Haskell tls library development files"
DESCRIPTION = "This package provides the Haskell tls library development files."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "ghc-tls-devel-2.4.3-1.3.aarch64.rpm"
RPM_HASH = "af8535bdecf5ed8f56f6e3bb6721e9f8033faae623fdb26604d63bf0188cc61fa4349bef7939a05d388f368c750b43dc83192287c274ffc4987b39c651a93b20"

RPROVIDES:${PN} += "ghc-devel-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-devel-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-devel-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-devel-crypton-x509-validation-1.9.1-A5KE59wkqBYCYMNBGaEl3l \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-ech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND \
ghc-devel-hpke-0.1.0-FWQ67GYIQQ2GKLielMsG9n \
ghc-devel-mlkem-0.2.1.0-I3LOwjV1LZnU6D8hY2Ok5 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-serialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-tls"

inherit rpm
