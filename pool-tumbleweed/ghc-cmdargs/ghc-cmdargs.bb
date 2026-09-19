SUMMARY = "Command line argument processing"
DESCRIPTION = "This library provides an easy way to define command line parsers. Most users \
will want to use the 'System.Console.CmdArgs.Implicit' module, whose \
documentation contains an example. \
 \
* 'System.Console.CmdArgs.Explicit' provides a way to write command line \
parsers for both single mode programs (most programs) and multiple mode \
programs (e.g. darcs or cabal). Parsers are defined by constructing a data \
structure. \
 \
* 'System.Console.CmdArgs.Implicit' provides a way to concisely define command \
line parsers, up to three times shorter than getopt. These parsers are \
translated into the Explicit data type. \
 \
* 'System.Console.CmdArgs.GetOpt' provides a wrapper allowing compatiblity with \
existing getopt parsers, mapping to the Explicit data type. \
 \
For a general reference on what command line flags are commonly used, see \
<http://www.faqs.org/docs/artu/ch10s05.html>."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-0.10.22-1.35.aarch64.rpm"
RPM_HASH = "bb9c1d4cfeec9acd57b38c393dc88d24f6c7bd7b7724969cb90afb095ed17532a2b777153ff1a0159457d8a7ba5fb1b316149988cbf9b1f36d6b5796dadc4c17"

RPROVIDES:${PN} += "ghc-cmdargs \
libHScmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg-ghc9.12.4.so"

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
