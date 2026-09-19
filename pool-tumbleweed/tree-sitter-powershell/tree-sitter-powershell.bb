SUMMARY = "PowerShell grammar for tree-sitter"
DESCRIPTION = "Python binding for the powershell tree-sitter grammar."
LICENSE = "MIT"

PV = "0.26.4"

RPM_NAME = "tree-sitter-powershell-0.26.4-1.1.aarch64.rpm"
RPM_HASH = "f8b2e4332f235fbd25f2ce08ede409b123d0093587431d13409d2118a310a50df45c9174c5523a58690b075561e9b8e9412fc35ccc95c98b4b617f06cae10ba9"

RPROVIDES:${PN} += "libtree-sitter-powershell.so \
tree-sitter-powershell \
treesitter-grammar-tree-sitter-powershell"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
