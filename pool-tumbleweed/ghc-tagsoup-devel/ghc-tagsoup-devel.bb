SUMMARY = "Haskell tagsoup library development files"
DESCRIPTION = "This package provides the Haskell tagsoup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-devel-0.14.8-6.31.aarch64.rpm"
RPM_HASH = "8d83a1b05331a9fba8c7b4d03fe0d12b33efeab81a629f66defcaf8f98d4a0a5fe87a2347a57ac5eaa75070040ca3c915d80b721eaa16a7ea0af8d56da77cddd"

RPROVIDES:${PN} += "ghc-devel-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-tagsoup-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-text-2.1.4-cf23 \
ghc-tagsoup"

inherit rpm
