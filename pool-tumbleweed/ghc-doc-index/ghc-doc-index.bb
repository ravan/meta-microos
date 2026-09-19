SUMMARY = "GHC library documentation indexing"
DESCRIPTION = "The package enables re-indexing of installed library documention."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-doc-index-9.12.4-1.3.noarch.rpm"
RPM_HASH = "93e7fd957ff57df61dc599172aae8f177210ae16c59156c108ad1ba7b12b7f827bb197ad8544cfbc2f48295c1b629c7c0d14034883cc1099a82fe5da31a42f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doc-index"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
