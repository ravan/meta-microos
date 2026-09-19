SUMMARY = "Devel package for tree-sitter-wgsl containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20230109.40259f3"

RPM_NAME = "tree-sitter-wgsl-devel-0+20230109.40259f3-2.4.noarch.rpm"
RPM_HASH = "6b98b6b0703eb5c6ed2696132a7eab7feb4e37a7e6e4ba18b27591f9759718943be47cdf559e60e388e952173e134965923d0f77e7d575d9c5b6cb57804ee33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-wgsl-devel \
treesitter-grammar-src-tree-sitter-wgsl"

RDEPENDS:${PN} += ""

inherit rpm
