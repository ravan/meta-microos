SUMMARY = "Haskell safe library development files"
DESCRIPTION = "This package provides the Haskell safe library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "ghc-safe-devel-0.3.21-2.25.aarch64.rpm"
RPM_HASH = "3a8db89bb9db4361f1bad4f2d7b651f137cc97996c91e45c9bbfc479f4d51ec163ffc8b7702a049f1248820406cce73919425c628577692df1cdbdda5511061d"

RPROVIDES:${PN} += "ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-safe-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-safe"

inherit rpm
