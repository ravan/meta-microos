SUMMARY = "For creating, comparing, parsing and printing Universally Unique Identifiers"
DESCRIPTION = "This library is useful for creating, comparing, parsing and printing \
Universally Unique Identifiers. \
 \
See <http://en.wikipedia.org/wiki/UUID> for the general idea."
LICENSE = "BSD-3-Clause"

PV = "1.3.16.1"

RPM_NAME = "ghc-uuid-1.3.16.1-1.2.aarch64.rpm"
RPM_HASH = "35dfa899c449461adbe8e17a7d0ff73d18618f3208c501e5395b600e462bd32d0b877ee59079fb2e55db996b147f5a00ccffef18abc58db990d9d57d0b5f1271"

RPROVIDES:${PN} += "ghc-uuid \
libHSuuid-1.3.16.1-JPvbmr4TLlEERTSybCyfOm-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS-ghc9.12.4.so \
libHScryptohash-sha1-0.11.101.0-8eRxmtRH1AP4nYxJeWtthM-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSentropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-info-0.2.1-I1lcnyergC0DdfN7xa3e0a-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSuuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
