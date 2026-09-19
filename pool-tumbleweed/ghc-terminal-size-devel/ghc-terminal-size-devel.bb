SUMMARY = "Haskell terminal-size library development files"
DESCRIPTION = "This package provides the Haskell terminal-size library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-devel-0.3.4-2.16.aarch64.rpm"
RPM_HASH = "68eb9125115640c3ae40a25e5428cf0a84b48719f240b45be4181e9a14de602598f8d73bfe57253ce777964d4f371bd8504379c35b9890c726fd22c1163de4ff"

RPROVIDES:${PN} += "ghc-devel-terminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf \
ghc-terminal-size-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-terminal-size"

inherit rpm
