SUMMARY = "Haskell fdo-notify library development files"
DESCRIPTION = "This package provides the Haskell fdo-notify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-devel-0.3.1-4.72.aarch64.rpm"
RPM_HASH = "ebd86ed411dda3b13f1aa9a115ca6aacd29d1fd73b7a30b6cdf94c4dce575b2342a5e989402a309079322bdfe09b5e95fe8c5d7d20e64963c8eeb4710d6eaaa1"

RPROVIDES:${PN} += "ghc-devel-fdo-notify-0.3.1-IlwolsMMSaXuKXfZ3yu8 \
ghc-fdo-notify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-dbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q \
ghc-fdo-notify"

inherit rpm
