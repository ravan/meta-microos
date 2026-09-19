SUMMARY = "High level, generic library for interrogative user interfaces"
DESCRIPTION = "'wizards' is a package designed for the quick and painless development of \
/interrogative/ programs, which revolve around a 'dialogue' with the user, who \
is asked a series of questions in a sequence much like an installation wizard. \
 \
Everything from interactive system scripts, to installation wizards, to \
full-blown shells can be implemented with the support of 'wizards'. \
 \
It is developed transparently on top of a free monad, which separates out the \
semantics of the program from any particular interface. A variety of backends \
exist, including console-based 'System.Console.Wizard.Haskeline' and \
'System.Console.Wizard.BasicIO', and the pure 'System.Console.Wizard.Pure'. \
It is also possible to write your own backends, or extend existing back-ends \
with new features. While both built-in IO backends operate on a console, there \
is no reason why 'wizards' cannot also be used for making GUI wizard \
interfaces. \
 \
See the github page for examples on usage: \
 \
<http://www.github.com/liamoc/wizards> \
 \
For creating backends, the module 'System.Console.Wizard.Internal' has a brief \
tutorial."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-1.0.3-7.16.aarch64.rpm"
RPM_HASH = "26af5e7861289f1dfab02d5a91219c6e1379ffe27554b84aa2f93f3e9a1f5b1f64b384e7aee59ad2ac61f4e0fcc2152fd862aa860d0136480cc318a832e73306"

RPROVIDES:${PN} += "ghc-wizards \
libHSwizards-1.0.3-4fQKmsLBMwT4qK3PkBwApR-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontrol-monad-free-0.6.2-INrHbxo4qSqC5LftAQgJHR-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShaskeline-0.8.4.1-767e-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSterminfo-0.4.1.7-3afa-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
