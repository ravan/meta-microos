SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python313-testpath-0.6.0-2.14.noarch.rpm"
RPM_HASH = "fce885f7148cd0337b07e7ca4f7189ffc705e33877b02c175db41fa65cdd02f2c0f3b123fd3a825dacec29fdc4b94fca176113d82bc9e739ea73bf2ff6b19826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testpath \
python3.13dist-testpath \
python313-testpath \
python3dist-testpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
