SUMMARY = "Haskell deriving-aeson library development files"
DESCRIPTION = "This package provides the Haskell deriving-aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.10"

RPM_NAME = "ghc-deriving-aeson-devel-0.2.10-1.22.aarch64.rpm"
RPM_HASH = "82cb489ea7511129b8196bd94fdb0cd4a142f9075a2317c0751b3e1493cc31db90720835170f225af18d64383e7f6858569e927574f40fe43e8bb8d2262cc5c8"

RPROVIDES:${PN} += "ghc-deriving-aeson-devel \
ghc-devel-deriving-aeson-0.2.10-A2Hr72Vk9XP91w802TwQUN"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-deriving-aeson \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
