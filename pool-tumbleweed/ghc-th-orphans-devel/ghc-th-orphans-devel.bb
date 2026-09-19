SUMMARY = "Haskell th-orphans library development files"
DESCRIPTION = "This package provides the Haskell th-orphans library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.17"

RPM_NAME = "ghc-th-orphans-devel-0.13.17-1.3.aarch64.rpm"
RPM_HASH = "5dba899d59cef2111b0d3e51b8cc1a8cb00b32e2564839c1dd1e8bed7601d864dbfbbb2cfe861abfc7acf4f9f84ac5f896a07f5ecd7a951b48d42ebccc560304"

RPROVIDES:${PN} += "ghc-devel-th-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2 \
ghc-th-orphans-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp \
ghc-devel-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-devel-th-reify-many-0.1.10-Y1BMkE9L3hAvIhFuDWL0x \
ghc-th-orphans"

inherit rpm
