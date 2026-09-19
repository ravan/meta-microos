SUMMARY = "Low-level binding to libpq"
DESCRIPTION = "This is a binding to libpq: the C application programmer's interface to \
PostgreSQL. libpq is a set of library functions that allow client programs to \
pass queries to the PostgreSQL backend server and to receive the results of \
these queries."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.0"

RPM_NAME = "ghc-postgresql-libpq-0.11.0.0-3.3.aarch64.rpm"
RPM_HASH = "3945f4e4298381d997555f4f55c1543232c7075d2165261ae5ee90656df5acfc931f7b78677b8f2f2f771724344df368cc1c6fa24c10a6cdc4492321d307d965"

RPROVIDES:${PN} += "ghc-postgresql-libpq \
libHSpostgresql-libpq-0.11.0.0-H53T8dUwW2oIfn4i9jqgbB-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libpq.so.5"

inherit rpm
