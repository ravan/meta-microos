SUMMARY = "Clear to write, read and edit DSL for HTML"
DESCRIPTION = "Clear to write, read and edit DSL for HTML. \
 \
* Names are consistent, and do not conflict with base or are keywords (all have \
suffix '_') \
 \
* Same combinator can be used for attributes and elements (e.g. \
'style_') \
 \
* For more, read <https://chrisdone.com/posts/lucid the blog post> \
 \
See the 'Lucid' module for more documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20260427"

RPM_NAME = "ghc-lucid-2.11.20260427-1.3.aarch64.rpm"
RPM_HASH = "688e1c01798edfe720d8010fad8a1a80607fc284e299852d4f61f840c209b9312df4657360a9c82d62ce3c2d3a06bdfee22feb0fe96c2253c250ff80f6c2694a"

RPROVIDES:${PN} += "ghc-lucid \
libHSlucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
