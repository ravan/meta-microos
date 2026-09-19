SUMMARY = "Haskell base-unicode-symbols profiling library"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-prof-0.2.4.2-1.23.aarch64.rpm"
RPM_HASH = "6748f65d7adc52c7b7af1734579c6ac025883923bf791e29e4207f95aa9592a37ac099a1eaa870745258f9c4480eab066c27cb59393253e89efafc0e28993981"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-prof \
ghc-prof-base-unicode-symbols-0.2.4.2-EOprbUpnIOv3U10zkWCZPk"

RDEPENDS:${PN} += "ghc-base-unicode-symbols-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
