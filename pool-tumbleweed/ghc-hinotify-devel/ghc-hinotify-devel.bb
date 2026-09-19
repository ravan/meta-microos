SUMMARY = "Haskell hinotify library development files"
DESCRIPTION = "This package provides the Haskell hinotify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-hinotify-devel-0.4.2-1.13.aarch64.rpm"
RPM_HASH = "fe00b6eab0d41f59afc6e92602fdd3067607e9b69c62457461cdb207cebf1c5ea46a2db472109bf87be7ec7cde14655216fa66c188392233d99cb63c42797ded"

RPROVIDES:${PN} += "ghc-devel-hinotify-0.4.2-4RRzWLCNgXK8AEnEbLT8bd \
ghc-hinotify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-unix-2.8.8.0-178a \
ghc-hinotify"

inherit rpm
