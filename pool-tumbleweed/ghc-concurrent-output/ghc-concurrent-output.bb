SUMMARY = "Ungarble output from several threads or commands"
DESCRIPTION = "Lets multiple threads and external processes concurrently output to the \
console, without it getting all garbled up. \
 \
Built on top of that is a way of defining multiple output regions, which are \
automatically laid out on the screen and can be individually updated by \
concurrent threads. Can be used for progress displays etc. \
 \
<<https://joeyh.name/code/concurrent-output/demo2.gif>>."
LICENSE = "BSD-2-Clause"

PV = "1.10.21"

RPM_NAME = "ghc-concurrent-output-1.10.21-1.29.aarch64.rpm"
RPM_HASH = "2a00d277d6d73a3683a871a32617075c5fb3ca2d8ecadfa54b96c42cf33c37da1d10451bcb56c2e13b32a75a60bf5306e2e3c0189a9173481ac35b67d4d8bdcf"

RPROVIDES:${PN} += "ghc-concurrent-output \
libHSconcurrent-output-1.10.21-Lr5KfTnjaSRGW66ZQE3au1-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSasync-2.2.6-4fW0sXrepSt4QxgAnnLVB6-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
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
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSterminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
