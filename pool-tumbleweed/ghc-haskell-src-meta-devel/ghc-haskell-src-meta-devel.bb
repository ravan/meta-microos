SUMMARY = "Haskell haskell-src-meta library development files"
DESCRIPTION = "This package provides the Haskell haskell-src-meta library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.8.15"

RPM_NAME = "ghc-haskell-src-meta-devel-0.8.15-2.3.aarch64.rpm"
RPM_HASH = "71fb2e91da39cc8887441db30de346a8aa3cfbf5cda2d32f2719824f9ead8e2a074e3610724162c645d2ac4558b7807a026104c54f8c97cb24997b34e37106d5"

RPROVIDES:${PN} += "ghc-devel-haskell-src-meta-0.8.15-FnQqpPy0mwl8lKE5H2GQu6 \
ghc-haskell-src-meta-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-haskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2 \
ghc-haskell-src-meta"

inherit rpm
