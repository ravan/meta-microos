SUMMARY = "A cross-platform, cross-console way to handle echoing terminal input"
DESCRIPTION = "The 'base' library exposes the 'hGetEcho' and 'hSetEcho' functions for querying \
and setting echo status, but unfortunately, neither function works with MinTTY \
consoles on Windows. This is a serious issue, since 'hGetEcho' and 'hSetEcho' \
are often used to disable input echoing when a program prompts for a password, \
so many programs will reveal your password as you type it on MinTTY! \
 \
This library provides an alternative interface which works with both MinTTY and \
other consoles. An example is included which demonstrates how one might prompt \
for a password using this library. To build it, make sure to configure with the \
'-fexample' flag."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-0.1.4-2.23.aarch64.rpm"
RPM_HASH = "0c488f6fadd5a52fb5a8119116f6a82122ef40a69317a9530781260ad1978f71fa7f14911bca8a27bc864aaca2a7004953ee527ec23f0ca6577a4ffa457ef78d"

RPROVIDES:${PN} += "ghc-echo \
libHSecho-0.1.4-2JVioXINDaCEoYt7R5FuJ9-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
