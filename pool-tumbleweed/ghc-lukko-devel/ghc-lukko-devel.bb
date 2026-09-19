SUMMARY = "Haskell lukko library development files"
DESCRIPTION = "This package provides the Haskell lukko library development files."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-lukko-devel-0.1.2-2.14.aarch64.rpm"
RPM_HASH = "881cf5957be9661de28fba1a4430f2874e35cd49906015ee5e849db686f236e8ff29b3f07ad8140f01e7a9dacc41e69cbde144acf6bbd08f7941feca979a6d1b"

RPROVIDES:${PN} += "ghc-devel-lukko-0.1.2-KyYOwE0CZU8A6c79eyT2Xk \
ghc-lukko-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-lukko"

inherit rpm
