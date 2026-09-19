SUMMARY = "Haskell cryptohash-sha1 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-devel-0.11.101.0-8.15.aarch64.rpm"
RPM_HASH = "5a10c79eab3cb70fd074eeb229ca52277f51c4bc2764904dd305a108eb08a23ada32c701793fbc9b9f342ecdf8422217a183b7acffd5a4121ab8746c3ad63909"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-devel \
ghc-devel-cryptohash-sha1-0.11.101.0-8eRxmtRH1AP4nYxJeWtthM"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-sha1 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
