SUMMARY = "Lua module wrapper around Haskell's System module"
DESCRIPTION = "Provides access to system information and functionality to Lua scripts via \
Haskell's `System` module. \
 \
This package is part of HsLua, a Haskell framework built around the embeddable \
scripting language <https://lua.org Lua>."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ghc-hslua-module-system-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "0ccc2523e00435f9429ca3fe80cc2486b84edede530984544508553d295c640f79a9e8d5bef5c6de2bdc4c9ad3853dec270d30530b72ed32c8a0d3984fd43b5b"

RPROVIDES:${PN} += "ghc-hslua-module-system \
libHShslua-module-system-1.3.0-JmXccm8tEh45eiVMZhLzZ2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr-ghc9.12.4.so \
libHShslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP-ghc9.12.4.so \
libHShslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o-ghc9.12.4.so \
libHShslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF-ghc9.12.4.so \
libHShslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA-ghc9.12.4.so \
libHShslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT-ghc9.12.4.so \
libHSlua-2.3.4-GxTlN73bN8C8KbBhVEtsew-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStemporary-1.3-2Osk9MNG2oU9jER7tTbSTz-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
