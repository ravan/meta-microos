SUMMARY = "Haskell wai-logger library documentation"
DESCRIPTION = "This package provides the Haskell wai-logger library documentation."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-wai-logger-doc-2.5.0-1.23.noarch.rpm"
RPM_HASH = "85fb0742ad3313c33cd618e1cc068b0fe310bdccdb577dd327f790ab2d37c26f0a4c4f435abd44488d483482a4fc58fae2dcaf82f197c2508da33bc6852dd97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
