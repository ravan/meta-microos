SUMMARY = "Haskell half library development files"
DESCRIPTION = "This package provides the Haskell half library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.3"

RPM_NAME = "ghc-half-devel-0.3.3-3.3.aarch64.rpm"
RPM_HASH = "67e94405ec53d06a48e87e20d67899d6faabc99a189bdd2f0bfe623e964a715afa95523a36c2e8efc34eb0cde0c8cf9528658e3a92c3ced8200bb35e1725f47d"

RPROVIDES:${PN} += "ghc-devel-half-0.3.3-7uW8H7RguCn8iNkagLajaD \
ghc-half-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-half"

inherit rpm
