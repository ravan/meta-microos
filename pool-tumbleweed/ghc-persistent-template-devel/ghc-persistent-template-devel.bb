SUMMARY = "Haskell persistent-template library development files"
DESCRIPTION = "This package provides the Haskell persistent-template library development \
files."
LICENSE = "MIT"

PV = "2.12.0.0"

RPM_NAME = "ghc-persistent-template-devel-2.12.0.0-1.18.aarch64.rpm"
RPM_HASH = "af648d4ab36dfaa33938fcd4711341581b05fca7e68516e63e82ce4bc7c17d514cdb9e6efe513ecb14449a9bbd75940e2f2111a62277ab58686a4c5b92cd6122"

RPROVIDES:${PN} += "ghc-devel-persistent-template-2.12.0.0-4ZJ723LO7QWK45Xw9nb0gB \
ghc-persistent-template-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-persistent-template"

inherit rpm
