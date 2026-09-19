SUMMARY = "Haskell Diff library development files"
DESCRIPTION = "This package provides the Haskell Diff library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-Diff-devel-1.0.2-1.12.aarch64.rpm"
RPM_HASH = "bb13875fa92d801248a1c8d3fc9b863f05a658ec8aaf39ba3b1ea25164fdd2591f1aacae34917368a38554860fb5c798474d78ed811791827e7b76fd780fc671"

RPROVIDES:${PN} += "ghc-Diff-devel \
ghc-devel-Diff-1.0.2-5PTxq8P0tjM13opDjMQ0ap"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Diff \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-pretty-1.1.3.6-b7fd"

inherit rpm
