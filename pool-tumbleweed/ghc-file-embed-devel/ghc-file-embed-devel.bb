SUMMARY = "Haskell file-embed library development files"
DESCRIPTION = "This package provides the Haskell file-embed library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.16.0"

RPM_NAME = "ghc-file-embed-devel-0.0.16.0-1.19.aarch64.rpm"
RPM_HASH = "9d235869d636f538ee437ab0b0167871de2be735288af1fda214aaa508bc5f8f6c1d094df05ebf44a413e8e7566150fcb9414d4412a6e0b94e3b707ec9f85c85"

RPROVIDES:${PN} += "ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-file-embed-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-file-embed"

inherit rpm
