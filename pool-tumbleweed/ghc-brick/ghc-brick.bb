SUMMARY = "A declarative terminal user interface library"
DESCRIPTION = "Write terminal user interfaces (TUIs) painlessly with 'brick'! You write an \
event handler and a drawing function and the library does the rest. \
 \
> module Main where > > import Brick > > ui :: Widget () > ui = str 'Hello, \
world!' > > main :: IO () > main = simpleMain ui \
 \
To get started, see: \
 \
* <https://github.com/jtdaugherty/brick/blob/master/README.md The README> \
 \
* The <https://github.com/jtdaugherty/brick/blob/master/docs/guide.rst Brick \
user guide> \
 \
* The demonstration programs in the 'programs' directory \
 \
This package deprecates <http://hackage.haskell.org/package/vty-ui vty-ui>."
LICENSE = "BSD-3-Clause"

PV = "2.12"

RPM_NAME = "ghc-brick-2.12-1.4.aarch64.rpm"
RPM_HASH = "2be8269129c578cf75a88f91e86f5a5d8db13eb9b7799fe785c5319004fa8ae402cc820d675df8a333949cfe2d7095b83fa49daeba7e14dde8616c0e9479cdc8"

RPROVIDES:${PN} += "ghc-brick \
libHSbrick-2.12-LgticZ12Zph9E2wGepOKBH-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbimap-0.5.0-4NSO3lF4JlF9IWsrimrxRe-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
libHSconfig-ini-0.2.7.0-7oGnb0uYOjJ1nTfrjTJt8v-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdata-clist-0.2-JcMjkvVz4h0BOKvHWv3aRs-ghc9.12.4.so \
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
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSmegaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6-ghc9.12.4.so \
libHSmicrolens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3-ghc9.12.4.so \
libHSmicrolens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5-ghc9.12.4.so \
libHSmicrolens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSparser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSterminfo-0.4.1.7-3afa-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSvty-6.6-EPyV4ZsVRx8EnXBLhcE4eO-ghc9.12.4.so \
libHSvty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8-ghc9.12.4.so \
libHSvty-unix-0.3.0.0-BdEZXN0VRxZI5S5J9qgVGK-ghc9.12.4.so \
libHSword-wrap-0.5-FAfG7XDOqTwGSwy25x3Nlx-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
