SUMMARY = "Haskell base-unicode-symbols library development files"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-devel-0.2.4.2-1.23.aarch64.rpm"
RPM_HASH = "992692154d97c70aade2aec699a146a46244310c8edecd485084ddacc64afde62343c265a77ff1b7fa686de2f8b781de4fba018d18398fdaafed9e4ade102798"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-devel \
ghc-devel-base-unicode-symbols-0.2.4.2-EOprbUpnIOv3U10zkWCZPk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-unicode-symbols \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
