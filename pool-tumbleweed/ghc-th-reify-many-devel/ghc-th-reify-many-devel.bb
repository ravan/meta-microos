SUMMARY = "Haskell th-reify-many library development files"
DESCRIPTION = "This package provides the Haskell th-reify-many library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-th-reify-many-devel-0.1.10-1.23.aarch64.rpm"
RPM_HASH = "2f6e90a800380f3cfb98b7ea677306947b0c5259494b49687a67866ae55824863bc8975f5560bb82cfa1458cc2aa230d7efc6aae5d52f5d23a316429f0eef2bd"

RPROVIDES:${PN} += "ghc-devel-th-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x \
ghc-th-reify-many-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-expand-syns-0.4.12.0-2BWsmg9V6mHJNn5DoPUfmz \
ghc-th-reify-many"

inherit rpm
