SUMMARY = "Haskell citeproc library documentation"
DESCRIPTION = "This package provides the Haskell citeproc library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.13.0.1"

RPM_NAME = "ghc-citeproc-doc-0.13.0.1-1.3.noarch.rpm"
RPM_HASH = "22b9f005d5180e16618c33c882dd2d808a81cbf767dbf288be7213b562296ed723055473e2180fc1fb2ca5c29bc1b9044c147a3f19ccdfc21aab749af200f52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-citeproc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
