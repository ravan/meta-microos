SUMMARY = "Haskell warp-tls library development files"
DESCRIPTION = "This package provides the Haskell warp-tls library development files."
LICENSE = "MIT"

PV = "3.4.14"

RPM_NAME = "ghc-warp-tls-devel-3.4.14-1.6.aarch64.rpm"
RPM_HASH = "9ab3054d76ba6f81f208cefe79def39f4eeca75741ed2b279fbe79c3eed0b9ec9c53b78f593bba74cd93136b84b954a45bd357fc08a34fea5e5d0baa862e3bd4"

RPROVIDES:${PN} += "ghc-devel-warp-tls-3.4.14-FNBdXrAc8Mj6a3UdfjSJg9 \
ghc-warp-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-recv-0.1.1-9tN4UPJrbcvHykqBUpm2ul \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-devel-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-devel-tls-session-manager-0.1.0-A4BrlELQF3J5ui8eShhjSg \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-warp-tls"

inherit rpm
