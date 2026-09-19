SUMMARY = "Haskell DAV profiling library"
DESCRIPTION = "This package provides the Haskell DAV profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-prof-1.3.4-4.105.aarch64.rpm"
RPM_HASH = "4bfeb54e4906f15a5f61766e993cc4aa63d94ae5ad0f407a6ef5268087d24ab281763430c9e54a685f9477bb3140da54cf347441c53e72f407bfb8e6141db4a7"

RPROVIDES:${PN} += "ghc-DAV-prof \
ghc-prof-DAV-1.3.4-7XYHbqxYkORCGGnqq2lhVZ"

RDEPENDS:${PN} += "ghc-DAV-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-lens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-prof-xml-hamlet-0.5.0.3-G8bMr9HQdFfCaa7mBpjnmK"

inherit rpm
