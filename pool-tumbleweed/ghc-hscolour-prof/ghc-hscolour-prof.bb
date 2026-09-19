SUMMARY = "Haskell hscolour profiling library"
DESCRIPTION = "This package provides the Haskell hscolour profiling library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25"

RPM_NAME = "ghc-hscolour-prof-1.25-1.32.aarch64.rpm"
RPM_HASH = "3a117059991ac76b3738a47442e80d7c7b936f8d91038b93a2872aea9e1247c329409f775f1ef2105ebc3e8c06f79ddd987ca04798248214f54fa9a4e62f9396"

RPROVIDES:${PN} += "ghc-hscolour-prof \
ghc-prof-hscolour-1.25-7g5wxbCbTVu2XnpAXvjFVU"

RDEPENDS:${PN} += "ghc-hscolour-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1"

inherit rpm
