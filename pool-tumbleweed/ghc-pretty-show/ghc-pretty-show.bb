SUMMARY = "Tools for working with derived `Show` instances and generic inspection of values"
DESCRIPTION = "We provide a library and an executable for working with derived 'Show' \
instances. By using the library, we can parse derived 'Show' instances into a \
generic data structure. The 'ppsh' tool uses the library to produce \
human-readable versions of 'Show' instances, which can be quite handy for \
debugging Haskell programs. We can also render complex generic values into an \
interactive Html page, for easier examination."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-1.10-4.37.aarch64.rpm"
RPM_HASH = "0eb6736fb1d79f0e0de3a8b826a488ac5aaf77e9ab576bd1295aeec3178bc6024738690e86c596e19a5c598042f306bdb0ffba7f1343a8c8fa994fd17d65ef7d"

RPROVIDES:${PN} += "ghc-pretty-show \
libHSpretty-show-1.10-9HKVlh92Ga177833HqSrwq-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShaskell-lexer-1.2.1-4PpJ3cUTICwEJqFuz43JwQ-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
