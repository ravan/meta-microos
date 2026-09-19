SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-latexcodec-3.0.1-1.1.noarch.rpm"
RPM_HASH = "e09fa4e4d185eadccd4af8aee40546b94f260a8bb4be59df3cd3d945170ff3bd3ee416fdae711d9ccdf72f4a291cd7bc3490c0ed96690d8248c53aa3aa0e72ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-latexcodec \
python314-latexcodec \
python3dist-latexcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
