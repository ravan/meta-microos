SUMMARY = "Python binding for the tree-sitter-bash grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-bash grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python313-tree-sitter-bash-0.25.1-3.1.aarch64.rpm"
RPM_HASH = "bed0bd33418bcc3b377d23c1282e3e86f6e697804a32c95db5c7226ca5e7cce8df67d399bdf89ccd4df12e59f132d8523bf2b7fef97a19b22318f10463bc5457"

RPROVIDES:${PN} += "python3-tree-sitter-bash \
python313-tree-sitter-bash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
