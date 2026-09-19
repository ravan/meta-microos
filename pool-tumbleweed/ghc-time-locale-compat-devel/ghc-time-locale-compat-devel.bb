SUMMARY = "Haskell time-locale-compat library development files"
DESCRIPTION = "This package provides the Haskell time-locale-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-devel-0.1.1.5-7.23.aarch64.rpm"
RPM_HASH = "4fd3c5cea7f9a07b3533145a5900219e3c849bad84fef12c729cda83a3c9b90bf29251c77fa12a3e114fba68001a6858d08f93f026a5e47fef180cb4bb64a03b"

RPROVIDES:${PN} += "ghc-devel-time-locale-compat-0.1.1.5-9vdyA9EPu1IDeF7oXoCWqM \
ghc-time-locale-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-time-1.14-a7dc \
ghc-time-locale-compat"

inherit rpm
