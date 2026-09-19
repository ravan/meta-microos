SUMMARY = "Python reader/writer for the DiffX file format"
DESCRIPTION = "A Python implementation of a reader and writer for the DiffX file \
format, an extension to the unified diff format that adds structured, \
unambiguous metadata for multi-commit, multi-file diffs."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python314-pydiffx-1.1-1.2.noarch.rpm"
RPM_HASH = "7ab4fe66b10d73ba44a3b5a4760a8dabf1d86362eb07c3d3aa31095c791745167ef343d69419ea64890ec8477c736f57387eff9cc9bbb4e8db18ad944ba7306d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydiffx \
python314-pydiffx \
python3dist-pydiffx"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
