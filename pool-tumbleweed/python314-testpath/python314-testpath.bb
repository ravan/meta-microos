SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python314-testpath-0.6.0-2.14.noarch.rpm"
RPM_HASH = "ed2eee7980fff80357bc9bdf04efd376869ad6546b861a18101650ee222735d1621baeb934a11ff2b8ba9655f4e18d663b57b5c647da6e4bb789e8d0ed0e4f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testpath \
python314-testpath \
python3dist-testpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
