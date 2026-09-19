SUMMARY = "Python binding for the objc tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_objc that loads the grammar library \
shipped in tree-sitter-objc and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python313-tree-sitter-objc-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "4c24e88cb52e4534b73702645ded495419802130e5ea04736c9407a5b404222efa056fddd3ede50fabfb97fedf6162c64e894a42aa306caecea05a20b19ae9b9"

RPROVIDES:${PN} += "python3-tree-sitter-objc \
python313-tree-sitter-objc"

RDEPENDS:${PN} += "python-abi \
tree-sitter-objc"

inherit rpm
