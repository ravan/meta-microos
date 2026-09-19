SUMMARY = "Haskell http2 library development files"
DESCRIPTION = "This package provides the Haskell http2 library development files."
LICENSE = "BSD-3-Clause"

PV = "5.3.10"

RPM_NAME = "ghc-http2-devel-5.3.10-2.9.aarch64.rpm"
RPM_HASH = "6eef4adf758bbe15b08b0db2e88e23767f1c8ee19874a2adcc1881883ff861e940d1995f16f9ae29b2a51e0ab3b199f26483c180374881d9fe6a124b328aa6ae"

RPROVIDES:${PN} += "ghc-devel-http2-5.3.10-I2wENTFww6Z7L3LiFVkQpl \
ghc-http2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-http-semantics-0.3.0-D5AfX4HSpBm3DHrTNQ2Sqe \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-devel-network-control-0.1.7-A85ociXgUcsEREzO9qpors \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-devel-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-http2"

inherit rpm
