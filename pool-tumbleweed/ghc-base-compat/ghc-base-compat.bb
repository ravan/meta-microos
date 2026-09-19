SUMMARY = "A compatibility layer for base"
DESCRIPTION = "Provides functions available in later versions of 'base' to a wider range of \
compilers, without requiring you to use CPP pragmas in your code. See the \
<https://github.com/haskell-compat/base-compat/blob/master/base-compat/README.markdown \
README> for what is covered. Also see the \
<https://github.com/haskell-compat/base-compat/blob/master/base-compat/CHANGES.markdown \
changelog> for recent changes. \
 \
Note that 'base-compat' does not add any orphan instances. There is a separate \
package, '<http://hackage.haskell.org/package/base-orphans base-orphans>', for \
that. \
 \
In addition, 'base-compat' does not backport any data types or type classes. \
See \
'<https://github.com/haskell-compat/base-compat/blob/master/base-compat/README.markdown#data-types-and-type-classes \
this section of the README>' for more info. \
 \
'base-compat' is designed to have zero dependencies. For a version of \
'base-compat' that depends on compatibility libraries for a wider support \
window, see the '<http://hackage.haskell.org/package/base-compat-batteries \
base-compat-batteries>' package. Most of the modules in this library have the \
same names as in 'base-compat-batteries' to make it easier to switch between \
the two. There also exist versions of each module with the suffix '.Repl', \
which are distinct from anything in 'base-compat-batteries', to allow for \
easier use in GHCi."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "ghc-base-compat-0.14.1-1.15.aarch64.rpm"
RPM_HASH = "c6546caf79e669f300de21056b76a730a235be33e3a7b5f49ec6ea3dfd7b0387fd633862c56060d5a16785e4233167b570dc6e5869b4e6fb91d2f7e6a6f6e361"

RPROVIDES:${PN} += "ghc-base-compat \
libHSbase-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy-ghc9.12.4.so"

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
libm.so.6"

inherit rpm
