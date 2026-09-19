SUMMARY = "Haskell lua library development files"
DESCRIPTION = "This package provides the Haskell lua library development files."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "ghc-lua-devel-2.3.4-1.8.aarch64.rpm"
RPM_HASH = "24c1b0edccc2baa0a59db7ed1c2020b6155398fda29a95a95fd24246de1b8b025143d7999ff162e97b6b74a29401ce618e6dbdfe5a3ac6c26ed65fc0f1013702"

RPROVIDES:${PN} += "ghc-devel-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-lua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-lua"

inherit rpm
