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

RPM_NAME = "python314-pyct-0.6.0-1.6.noarch.rpm"
RPM_HASH = "0455ca4a925fe4a909d2b2cbebb3f7e95f3980adadff023c28bbe20fc0f5b9d9699a53cfb3b031d5ac93692eae58ff2227ab896f0653065bc701331ef466f11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyct \
python314-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-param \
update-alternatives"

inherit rpm
