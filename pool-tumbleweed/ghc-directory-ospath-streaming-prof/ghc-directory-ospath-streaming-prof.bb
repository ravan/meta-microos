SUMMARY = "Haskell directory-ospath-streaming profiling library"
DESCRIPTION = "This package provides the Haskell directory-ospath-streaming profiling library."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "ghc-directory-ospath-streaming-prof-0.2.2-2.11.aarch64.rpm"
RPM_HASH = "f3938cda7d007652ad2b0e8305c90bdcb1a5047f3ee36f37477c7400c7d9afdda424ecf044a0762946599ac7c3c6cdf3959f41cb56f8ed30a4824a4ad637aaee"

RPROVIDES:${PN} += "ghc-directory-ospath-streaming-prof \
ghc-prof-directory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9"

RDEPENDS:${PN} += "ghc-directory-ospath-streaming-devel \
ghc-prof-atomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
