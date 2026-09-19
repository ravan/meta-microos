SUMMARY = "Haskell warp-tls profiling library"
DESCRIPTION = "This package provides the Haskell warp-tls profiling library."
LICENSE = "MIT"

PV = "3.4.14"

RPM_NAME = "ghc-warp-tls-prof-3.4.14-1.6.aarch64.rpm"
RPM_HASH = "ed938918996bc8611ba2659125a99b4536e1ea52a30b14fe08519a6cf9bec09656bf96ef283e4eaf2bb4f305b602a7b1aac515c8369350cda7808f3dafc9f5f8"

RPROVIDES:${PN} += "ghc-prof-warp-tls-3.4.14-FNBdXrAc8Mj6a3UdfjSJg9 \
ghc-warp-tls-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-recv-0.1.1-9tN4UPJrbcvHykqBUpm2ul \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-prof-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-prof-tls-session-manager-0.1.0-A4BrlELQF3J5ui8eShhjSg \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-warp-tls-devel"

inherit rpm
