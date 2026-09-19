SUMMARY = "Haskell githash library development files"
DESCRIPTION = "This package provides the Haskell githash library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-devel-0.1.7.0-1.34.aarch64.rpm"
RPM_HASH = "877734091372f2800f63ee45ac174130ce26df21607759d68fe6ec0cd57642d2aefa99ce07506646dc500c52ec648873fcd59862bbf0ef92383b006396108dc9"

RPROVIDES:${PN} += "ghc-devel-githash-0.1.7.0-CZogn6tBFSRH7zyPP5YHJu \
ghc-githash-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp \
ghc-githash"

inherit rpm
