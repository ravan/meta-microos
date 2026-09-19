SUMMARY = "Haskell hslua-classes profiling library"
DESCRIPTION = "This package provides the Haskell hslua-classes profiling library."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-classes-prof-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "10a11c7afdebd63dd78bee27a40bcc51f1f8a4e3c4b66e699236968c8a7ee65e017fbd97ce693a6c4d71de26da16cd19d0f6216b4be256bb4fb92c3978516071"

RPROVIDES:${PN} += "ghc-hslua-classes-prof \
ghc-prof-hslua-classes-2.3.2-C895qHuusP79caxJu1uhwF"

RDEPENDS:${PN} += "ghc-hslua-classes-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-text-2.1.4-cf23"

inherit rpm
