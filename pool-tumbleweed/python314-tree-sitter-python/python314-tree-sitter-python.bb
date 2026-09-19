SUMMARY = "Python binding for the python tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_python that loads the grammar library \
shipped in tree-sitter-python and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.23.6"

RPM_NAME = "python314-tree-sitter-python-0.23.6-3.1.aarch64.rpm"
RPM_HASH = "fb149e575cd37bd890b68ea8b43340f45238c4bc6d58ef1e2d5525da14773792ce6eb36034ac62c34e9fb36e224162a393074d5fbe2d641f0a557c89ba551829"

RPROVIDES:${PN} += "python314-tree-sitter-python"

RDEPENDS:${PN} += "python-abi \
tree-sitter-python"

inherit rpm
