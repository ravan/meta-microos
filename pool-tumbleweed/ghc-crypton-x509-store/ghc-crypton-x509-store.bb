SUMMARY = "X.509 collection accessing and storing methods"
DESCRIPTION = "X.509 collection accessing and storing methods for certificate, crl, exception \
list."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-store-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "68c78b7fbd2622cd65898ae93e98f415d71a6b037b058d61acfe255a85fa51d4823eeee0b401b29a93e87ebbaa4fcd9768a0ac34e460cf1cd0721b31f0588387"

RPROVIDES:${PN} += "ghc-crypton-x509-store \
libHScrypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-1.0-GqCyVT5DfwtBcN8MC2i0Li-ghc9.12.4.so \
libHSbase64-1.0-Ca310PwaD9pGmjzA3S4jr6-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScrypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB-ghc9.12.4.so \
libHScrypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1-ghc9.12.4.so \
libHScrypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ-ghc9.12.4.so \
libHScrypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB-ghc9.12.4.so \
libHScrypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij-ghc9.12.4.so \
libHScrypton-x509-1.9.1-haGktaKI8uFy9MudMqGII-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSinteger-gmp-1.1-09fd-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSram-0.22.0-4Io46KcWliV5ncwh4lemlr-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStime-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
