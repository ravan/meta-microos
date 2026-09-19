SUMMARY = "Haskell fdo-notify profiling library"
DESCRIPTION = "This package provides the Haskell fdo-notify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-prof-0.3.1-4.72.aarch64.rpm"
RPM_HASH = "99e7fa0eb8d56475d140cd690369cf48ab21190f226d321cf843e3b4766d8f9f38cd5d250cbadc4d8f8873dc5ec6dcf21125472273f3e0175871530fd4bbd523"

RPROVIDES:${PN} += "ghc-fdo-notify-prof \
ghc-prof-fdo-notify-0.3.1-IlwolsMMSaXuKXfZ3yu8"

RDEPENDS:${PN} += "ghc-fdo-notify-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-dbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q"

inherit rpm
