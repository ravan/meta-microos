SUMMARY = "Devel package for tree-sitter-jinja2 containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "Apache-2.0"

PV = "0+20240829.31c0292"

RPM_NAME = "tree-sitter-jinja2-devel-0+20240829.31c0292-2.4.noarch.rpm"
RPM_HASH = "f3f8c751d6b74c39d9635ac6050ce5b51a893dc132290b72650f93a5fef7954c1a1b93d5c4bfc26dcdb57f148d7cfa3f71ecbc9ad19e417cd7b72b88d85c7b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-jinja2-devel \
treesitter-grammar-src-tree-sitter-jinja2"

RDEPENDS:${PN} += ""

inherit rpm
