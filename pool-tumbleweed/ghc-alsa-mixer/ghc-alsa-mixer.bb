SUMMARY = "Bindings to the ALSA simple mixer API"
DESCRIPTION = "This package provides bindings to the ALSA simple mixer API."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-alsa-mixer-0.3.0.1-1.20.aarch64.rpm"
RPM_HASH = "b306ba52e5e2ac75d275461e4aa4b6c7ee9d076bd9a007154c5b739aa77b5a28c0b2befc74bc0aa3dd3be93d231a45db91ff2802657df8c260a0b48946bc2ab4"

RPROVIDES:${PN} += "ghc-alsa-mixer \
libHSalsa-mixer-0.3.0.1-ByTU73KIfiF2vSD5rVSjfR-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSalsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSextensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU-ghc9.12.4.so \
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
libasound.so.2 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
