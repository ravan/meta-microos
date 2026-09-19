SUMMARY = "Run code in Markdown files or shell scripts very interactively"
DESCRIPTION = "tl;dr: demosh can run shell scripts or Markdown files in a very interactive \
way, showing commentary in between running commands, and waiting for you to hit \
RETURN to proceed before running commands. It was created as a tool for doing \
live demos of relatively complex things. See testing.md and testing.sh for \
examples."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python314-demosh-0.6.0-1.8.noarch.rpm"
RPM_HASH = "e6b0cef97a5016ac78a0f684c5af9bba015bafe46e2a9abe1de8f1db374fffe62cd5bb0ddeee246d615194ff3fd39d77f88412976303185ac4c4280b7bcb5c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-demosh \
python314-demosh \
python3dist-demosh"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-curses \
update-alternatives"

inherit rpm
