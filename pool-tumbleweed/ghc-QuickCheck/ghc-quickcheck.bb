SUMMARY = "Automatic testing of Haskell programs"
DESCRIPTION = "QuickCheck is a library for random testing of program properties. The \
programmer provides a specification of the program, in the form of properties \
which functions should satisfy, and QuickCheck then tests that the properties \
hold in a large number of randomly generated cases. Specifications are \
expressed in Haskell, using combinators provided by QuickCheck. \
QuickCheck provides combinators to define properties, observe the distribution \
of test data, and define test data generators. \
 \
Most of QuickCheck's functionality is exported by the main 'Test.QuickCheck' \
module. The main exception is the monadic property testing library in \
'Test.QuickCheck.Monadic'. \
 \
If you are new to QuickCheck, you can try looking at the following resources: \
 \
* The <http://www.cse.chalmers.se/~rjmh/QuickCheck/manual.html official \
QuickCheck manual>. It's a bit out-of-date in some details and doesn't cover \
newer QuickCheck features, but is still full of good advice. * \
<https://begriffs.com/posts/2017-01-14-design-use-quickcheck.html>, a detailed \
tutorial written by a user of QuickCheck. \
 \
The <https://hackage.haskell.org/package/quickcheck-instances \
quickcheck-instances> companion package provides instances for types in Haskell \
Platform packages at the cost of additional dependencies."
LICENSE = "BSD-3-Clause"

PV = "2.15.0.1"

RPM_NAME = "ghc-QuickCheck-2.15.0.1-2.15.aarch64.rpm"
RPM_HASH = "9ec20ff4e03594112f2edb99fddeed055f60601fadad037c37b6dbc28c13ef10539ef00cdee460483743500eab01c176010b9f37648c66fea3c5b8f1a4b28c25"

RPROVIDES:${PN} += "ghc-QuickCheck \
libHSQuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
