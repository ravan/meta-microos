SUMMARY = "Retry combinators for monadic actions that may fail"
DESCRIPTION = "This package exposes combinators that can wrap arbitrary monadic actions. \
They run the action and potentially retry running it with some configurable \
delay for a configurable number of times. The purpose is to make it easier to \
work with IO and especially network IO actions that often experience temporary \
failure and warrant retrying of the original action. For example, a database \
query may time out for a while, in which case we should hang back for a bit and \
retry the query instead of simply raising an exception."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.1"

RPM_NAME = "ghc-retry-0.9.3.1-1.15.aarch64.rpm"
RPM_HASH = "eb306a372e76a597b1fdcf6971059a87c4c7a76afebc9b413e1192d8916f354df45dbc73e45ee304c6e3a388220d25375a6c0e04af026e718348fa4aea592936"

RPROVIDES:${PN} += "ghc-retry \
libHSretry-0.9.3.1-Ul1oSc0PafBv9JJCTFdQa-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
