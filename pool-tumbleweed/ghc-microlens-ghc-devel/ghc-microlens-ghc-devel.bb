SUMMARY = "Haskell microlens-ghc library development files"
DESCRIPTION = "This package provides the Haskell microlens-ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.15.2"

RPM_NAME = "ghc-microlens-ghc-devel-0.4.15.2-1.9.aarch64.rpm"
RPM_HASH = "1905b8cb77b59bd7fbe077e54017c88e901e90dde24178f6c3dd34e6bd7b49666b8964cdc681072de733f8348e80e2bb13b110b87aef5321a054ca1b556e95e2"

RPROVIDES:${PN} += "ghc-devel-microlens-ghc-0.4.15.2-Cj0815upqHk4qg3lDbGmdr \
ghc-microlens-ghc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-microlens-ghc"

inherit rpm
