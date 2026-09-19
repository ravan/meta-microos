SUMMARY = "Python binding for the tree-sitter-ruby grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-ruby grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python314-tree-sitter-ruby-0.23.1-5.1.aarch64.rpm"
RPM_HASH = "d0ab55527efe7ecc94d9732458cfa07cd2a031af42bf1440d50a348c1b0df83713d0a772846eb80714f99e18b6a8eb84ada1841b5990f99a66b3d9b117bb253d"

RPROVIDES:${PN} += "python314-tree-sitter-ruby"

RDEPENDS:${PN} += "python-abi"

inherit rpm
