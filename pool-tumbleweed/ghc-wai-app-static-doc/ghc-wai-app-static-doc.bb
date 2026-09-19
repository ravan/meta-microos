SUMMARY = "Haskell wai-app-static library documentation"
DESCRIPTION = "This package provides the Haskell wai-app-static library documentation."
LICENSE = "MIT"

PV = "3.1.9.1"

RPM_NAME = "ghc-wai-app-static-doc-3.1.9.1-1.6.noarch.rpm"
RPM_HASH = "9f860dad931fe94eaa9f2e3e19d3f18ebb4f975a6333bd77942eb0d87f0a8cd4b365912a4a0701071577a1c1559e62c85e7167be61ee01467fc1e0b0658cf869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-app-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
