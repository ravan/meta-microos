SUMMARY = "Haskell warp profiling library"
DESCRIPTION = "This package provides the Haskell warp profiling library."
LICENSE = "MIT"

PV = "3.4.9"

RPM_NAME = "ghc-warp-prof-3.4.9-1.15.aarch64.rpm"
RPM_HASH = "c4cdf88c922354ba66200492a27f9f5c13bffa660394b0531024f8de040f344e8b3bc22567fcdad5f2a146e51ac0b6ce3363a270b96eeda2b13bd3a651b20c12"

RPROVIDES:${PN} += "ghc-prof-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-warp-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bsb-http-chunked-0.0.0.4-5cZHaHeIaQxIWhD1tKvYpE \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-http-date-0.0.11-6QGoEWt5iWVBVu6inZxd9J \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-http2-5.3.10-I2wENTFww6Z7L3LiFVkQpl \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-recv-0.1.1-9tN4UPJrbcvHykqBUpm2ul \
ghc-prof-simple-sendfile-0.2.32-1TxnJXytdne4UoBrRdi39p \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-warp-devel"

inherit rpm
