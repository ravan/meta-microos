SUMMARY = "Haskell extra library documentation"
DESCRIPTION = "This package provides the Haskell extra library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "ghc-extra-doc-1.8.1-1.7.noarch.rpm"
RPM_HASH = "c2bc57bed064662f999626c460203e9d6afe629db70852f860fc590cb4a318f64f17c0ef552426edd8293c561147b21148b0df849195754a05041a3661d72183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
