SUMMARY = "Simple and easy network connection API"
DESCRIPTION = "Simple network library for all your connection needs. \
 \
Features: Really simple to use, SSL/TLS, SOCKS. \
 \
This library provides a very simple api to create sockets to a destination with \
the choice of SSL/TLS, and SOCKS."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-crypton-connection-0.4.6-1.3.aarch64.rpm"
RPM_HASH = "14389344965efc05923d54b984666caaa21f7dcc6ea41c88eafc8252236c3b9be9c783ea845302ff68dc82898fee04010f7bc5ffe08a429b2632e0f130546070"

RPROVIDES:${PN} += "ghc-crypton-connection \
libHScrypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-WSZSnBitxp1mS4dOP2hyq-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-1.0-GqCyVT5DfwtBcN8MC2i0Li-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbase64-1.0-Ca310PwaD9pGmjzA3S4jr6-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbyteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ-ghc9.12.4.so \
libHScereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScrypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB-ghc9.12.4.so \
libHScrypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1-ghc9.12.4.so \
libHScrypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ-ghc9.12.4.so \
libHScrypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB-ghc9.12.4.so \
libHScrypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij-ghc9.12.4.so \
libHScrypton-socks-0.6.2-ArLwOvrWYIxHawSNyZavl9-ghc9.12.4.so \
libHScrypton-x509-1.9.1-haGktaKI8uFy9MudMqGII-ghc9.12.4.so \
libHScrypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh-ghc9.12.4.so \
libHScrypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp-ghc9.12.4.so \
libHScrypton-x509-validation-1.9.1-A5KE59wkqBYCYMNBGaEl3l-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShalf-0.3.3-7uW8H7RguCn8iNkagLajaD-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHShpke-0.1.0-FWQ67GYIQQ2GKLielMsG9n-ghc9.12.4.so \
libHSinteger-gmp-1.1-09fd-ghc9.12.4.so \
libHSiproute-1.7.15-E8DjYDi46DFHUJbuCQco8p-ghc9.12.4.so \
libHSmlkem-0.2.1.0-I3LOwjV1LZnU6D8hY2Ok5-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSnetwork-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18-ghc9.12.4.so \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so \
libHSold-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSram-0.22.0-4Io46KcWliV5ncwh4lemlr-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSserialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStime-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l-ghc9.12.4.so \
libHStls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
