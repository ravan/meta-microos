SUMMARY = "Rerun only tests which failed in a previous test run"
DESCRIPTION = "This ingredient for the <https://hackage.haskell.org/package/tasty tasty> \
testing framework allows filtering a test tree depending on the outcome of the \
previous run. This may be useful in many scenarios, especially when a test \
suite grows large."
LICENSE = "BSD-3-Clause"

PV = "1.1.20"

RPM_NAME = "ghc-tasty-rerun-1.1.20-3.7.aarch64.rpm"
RPM_HASH = "f7a61f48b965886198734e844e605566b6f20886a9af72e5ee9aed3c9dd239975d47211e7b304372e2cc15773275119e976f636843f521edbc5897b2b4e24126"

RPROVIDES:${PN} += "ghc-tasty-rerun \
libHStasty-rerun-1.1.20-ApQVGOIA4TkE6635pNBbel-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
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
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSoptparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0-ghc9.12.4.so \
libHSprettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
