SUMMARY = "Haskell warp library development files"
DESCRIPTION = "This package provides the Haskell warp library development files."
LICENSE = "MIT"

PV = "3.4.9"

RPM_NAME = "ghc-warp-devel-3.4.9-1.15.aarch64.rpm"
RPM_HASH = "1999bc176c8d8c31426f480ffcc16994833b53485e9ef71296798894cb6a18d247070453c72bbedd3bd1bbc2e49041bcb1acc42be21f478951381e9e6316f668"

RPROVIDES:${PN} += "ghc-devel-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-warp-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bsb-http-chunked-0.0.0.4-5cZHaHeIaQxIWhD1tKvYpE \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-http-date-0.0.11-6QGoEWt5iWVBVu6inZxd9J \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-http2-5.3.10-I2wENTFww6Z7L3LiFVkQpl \
ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-recv-0.1.1-9tN4UPJrbcvHykqBUpm2ul \
ghc-devel-simple-sendfile-0.2.32-1TxnJXytdne4UoBrRdi39p \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-warp"

inherit rpm
