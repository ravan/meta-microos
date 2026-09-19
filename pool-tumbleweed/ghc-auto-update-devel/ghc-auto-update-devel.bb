SUMMARY = "Haskell auto-update library development files"
DESCRIPTION = "This package provides the Haskell auto-update library development files."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "ghc-auto-update-devel-0.2.6-1.15.aarch64.rpm"
RPM_HASH = "95668641be40168c402d11a922c95bf3bf6735987c482153114f75bb44aedb9141cc74adddf43f3f621f61725a90de385a16e152f578959322c9e0d61898eea0"

RPROVIDES:${PN} += "ghc-auto-update-devel \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-auto-update \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-stm-2.5.3.1-6d74"

inherit rpm
