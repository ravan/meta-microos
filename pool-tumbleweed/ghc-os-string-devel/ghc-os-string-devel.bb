SUMMARY = "Haskell os-string library development files"
DESCRIPTION = "This package provides the Haskell os-string library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.10"

RPM_NAME = "ghc-os-string-devel-2.0.10-1.3.aarch64.rpm"
RPM_HASH = "40ad3704621e3fae3a22ead04173f41664bcb8ec48f214c6baf91b8535bdb621e3e14ad7ba2bf2eb44f742a9b9f80b8d290e1818c77a38e447dc58a21b3c7353"

RPROVIDES:${PN} += "ghc-devel-os-string-2.0.10-5320 \
ghc-os-string-devel \
ghc-os-string-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-os-string"

inherit rpm
