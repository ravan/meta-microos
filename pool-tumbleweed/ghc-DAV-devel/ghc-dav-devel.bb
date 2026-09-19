SUMMARY = "Haskell DAV library development files"
DESCRIPTION = "This package provides the Haskell DAV library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-devel-1.3.4-4.105.aarch64.rpm"
RPM_HASH = "0fe16e56c23e43ef766804ebf6aee16cefe74648ddf94be4761189704f4d01ec820de853700e7e96a2ab55f85c10a2636d258db4e66fe57c7620c5f59346881f"

RPROVIDES:${PN} += "ghc-DAV-devel \
ghc-devel-DAV-1.3.4-7XYHbqxYkORCGGnqq2lhVZ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-DAV \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-lens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-devel-xml-hamlet-0.5.0.3-G8bMr9HQdFfCaa7mBpjnmK"

inherit rpm
