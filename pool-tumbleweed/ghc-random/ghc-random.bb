SUMMARY = "Pseudo-random number generation"
DESCRIPTION = "This package provides basic pseudo-random number generation, including the \
ability to split random number generators. \
 \
== 'System.Random': pure pseudo-random number interface \
 \
In pure code, use 'System.Random.uniform' and 'System.Random.uniformR' from \
'System.Random' to generate pseudo-random numbers with a pure pseudo-random \
number generator like 'System.Random.StdGen'. \
 \
As an example, here is how you can simulate rolls of a six-sided die using \
'System.Random.uniformR': \
 \
>>> let roll = uniformR (1, 6) :: RandomGen g => g -> (Word, g) >>> let rolls = \
unfoldr (Just . roll) :: RandomGen g => g -> [Word] >>> let pureGen = mkStdGen \
42 >>> take 10 (rolls pureGen) :: [Word] [1,1,3,2,4,5,3,4,6,2] \
 \
See 'System.Random' for more details. \
 \
== 'System.Random.Stateful': monadic pseudo-random number interface \
 \
In monadic code, use 'System.Random.Stateful.uniformM' and \
'System.Random.Stateful.uniformRM' from 'System.Random.Stateful' to generate \
pseudo-random numbers with a monadic pseudo-random number generator, or using a \
monadic adapter. \
 \
As an example, here is how you can simulate rolls of a six-sided die using \
'System.Random.Stateful.uniformRM': \
 \
>>> let rollM = uniformRM (1, 6) :: StatefulGen g m => g -> m Word >>> let \
pureGen = mkStdGen 42 >>> runStateGen_ pureGen (replicateM 10 . rollM) :: \
[Word] [1,1,3,2,4,5,3,4,6,2] \
 \
The monadic adapter 'System.Random.Stateful.runStateGen_' is used here to lift \
the pure pseudo-random number generator 'pureGen' into the \
'System.Random.Stateful.StatefulGen' context. \
 \
The monadic interface can also be used with existing monadic pseudo-random \
number generators. In this example, we use the one provided in the \
<https://hackage.haskell.org/package/mwc-random mwc-random> package: \
 \
>>> import System.Random.MWC as MWC >>> let rollM = uniformRM (1, 6) :: \
StatefulGen g m => g -> m Word >>> monadicGen <- MWC.create >>> replicateM 10 \
(rollM monadicGen) :: IO [Word] [2,3,6,6,4,4,3,1,5,4] \
 \
See 'System.Random.Stateful' for more details."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-random-1.3.1-1.10.aarch64.rpm"
RPM_HASH = "2dd217e585a55655374518f577cc19a8dfae8a55a84ad53761afbbb89c9ef699cf109e0aadc35d177a9f020fa22f93f195da828b79af6a2c34839a23f64d6e0e"

RPROVIDES:${PN} += "ghc-random \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
