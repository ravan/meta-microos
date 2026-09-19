SUMMARY = "Domain Name Service (DNS) lookup via the libresolv standard library routines"
DESCRIPTION = "This package implements an API for accessing the [Domain Name Service \
(DNS)](https://tools.ietf.org/html/rfc1035) resolver service via the standard \
'libresolv' system library (whose API is often available directly via the \
standard 'libc' C library) on Unix systems. \
 \
This package also includes support for decoding message record types as defined \
in the following RFCs: \
 \
- [RFC 1035](https://tools.ietf.org/html/rfc1035): Domain Names - \
Implementation And Specification - [RFC \
1183](https://tools.ietf.org/html/rfc1183): New DNS RR Definitions - [RFC \
2782](https://tools.ietf.org/html/rfc2782): A DNS RR for specifying the \
location of services (DNS SRV) - [RFC \
2915](https://tools.ietf.org/html/rfc2915): The Naming Authority Pointer \
(NAPTR) DNS Resource Record - [RFC 3596](https://tools.ietf.org/html/rfc3596): \
DNS Extensions to Support IP Version 6 - [RFC \
4034](https://tools.ietf.org/html/rfc4034): Resource Records for the DNS \
Security Extensions - [RFC 4255](https://tools.ietf.org/html/rfc4255): Using \
DNS to Securely Publish Secure Shell (SSH) Key Fingerprints - [RFC \
4408](https://tools.ietf.org/html/rfc4408): Sender Policy Framework (SPF) for \
Authorizing Use of Domains in E-Mail, Version 1 - [RFC \
5155](https://tools.ietf.org/html/rfc5155): DNS Security (DNSSEC) Hashed \
Authenticated Denial of Existence - [RFC \
6844](https://tools.ietf.org/html/rfc6844): DNS Certification Authority \
Authorization (CAA) Resource Record - [RFC \
6891](https://tools.ietf.org/html/rfc6891): Extension Mechanisms for DNS \
(EDNS(0)) - [RFC 7553](https://tools.ietf.org/html/rfc7553): The Uniform \
Resource Identifier (URI) DNS Resource Record \
 \
For Windows, the package [windns](https://hackage.haskell.org/package/windns) \
provides a compatible subset of this package's API."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.3"

RPM_NAME = "ghc-resolv-0.2.0.3-1.9.aarch64.rpm"
RPM_HASH = "7bba7878e552319d4e6f1828daafb0aa959a41db7b1c91ad3032c9b1511dcdb0db7eb2a028f8291e5c4782226e5a87bac89b18a4e8639024e0f580a506072ebe"

RPROVIDES:${PN} += "ghc-resolv \
libHSresolv-0.2.0.3-2a3UXbRQZR0IVSb1MrCNb4-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
