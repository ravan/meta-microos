SUMMARY = "Haskell hslua-marshalling profiling library"
DESCRIPTION = "This package provides the Haskell hslua-marshalling profiling library."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-marshalling-prof-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "568b1f50f74c91aef00f95be43206b8bde89a65259afea12b3b0afd147f3292802f0e24df8b7a769f8977165564276589fe086220db58cb2502c46398be7f178"

RPROVIDES:${PN} += "ghc-hslua-marshalling-prof \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o"

RDEPENDS:${PN} += "ghc-hslua-marshalling-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-text-2.1.4-cf23"

inherit rpm
