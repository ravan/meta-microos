SUMMARY = "Python package for common tasks for users"
DESCRIPTION = "A utility package that includes: \
 \
  1. pyct.cmd: Makes various commands available to other \
     packages. (Currently no sophisticated plugin system, just a try \
     import/except in the other packages.) The same commands are \
     available from within python. Can either add new subcommands to \
     an existing argparse based command if the module has an existing \
     command, or create the entire command if the module has no \
     existing command. Currently, there are commands for copying \
     examples and fetching data. See \
 \
  2. pyct.build: Provides various commands to help package \
     building, primarily as a convenience for project maintainers."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python313-pyct-0.6.0-1.6.noarch.rpm"
RPM_HASH = "afe084e10a58337e619965c3f701891f9cc6815ce200a4de4d2a6da1f762545dee1b8ec1791f1ff9f8bb6951184ba3eafb8c86ec5238a027655d9cc84f389afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyct \
python3.13dist-pyct \
python313-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-param \
update-alternatives"

inherit rpm
