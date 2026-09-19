SUMMARY = "A logging system for WAI"
DESCRIPTION = "A logging system for WAI(Web Application Interface)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-wai-logger-2.5.0-1.23.aarch64.rpm"
RPM_HASH = "24e945e5851ab29ce39d8a6acf5f0c4fe9b52265f34d52b3b25c147ae06742091feb0690d40c179762e9083efafbd1f7026394843092b81080ea675bbdef8316"

RPROVIDES:${PN} += "ghc-wai-logger \
libHSwai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSauto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbyteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSeasy-file-0.2.5-HaH29sPzevuLIcTD4Zvwg0-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHShttp-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so \
libHSold-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn-ghc9.12.4.so \
libHSunix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei-ghc9.12.4.so \
libHSwai-3.2.4-Is1UVC1czjX2cAufnl3tJW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
