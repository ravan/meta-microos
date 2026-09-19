SUMMARY = "Haskell http2 profiling library"
DESCRIPTION = "This package provides the Haskell http2 profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.3.10"

RPM_NAME = "ghc-http2-prof-5.3.10-2.9.aarch64.rpm"
RPM_HASH = "c0abfdc3fb8f7ff56f8ae6f7e0ac1cd2f0c3e51f69804df202bd7a1ec429e678d9189731c9628a2e5c00fd38bfb280dbc093dd219a3f3fd249affd3727d058fa"

RPROVIDES:${PN} += "ghc-http2-prof \
ghc-prof-http2-5.3.10-I2wENTFww6Z7L3LiFVkQpl"

RDEPENDS:${PN} += "ghc-http2-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-http-semantics-0.3.0-D5AfX4HSpBm3DHrTNQ2Sqe \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-prof-network-control-0.1.7-A85ociXgUcsEREzO9qpors \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-prof-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
