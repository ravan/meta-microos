SUMMARY = "Run code in Markdown files or shell scripts very interactively"
DESCRIPTION = "tl;dr: demosh can run shell scripts or Markdown files in a very interactive \
way, showing commentary in between running commands, and waiting for you to hit \
RETURN to proceed before running commands. It was created as a tool for doing \
live demos of relatively complex things. See testing.md and testing.sh for \
examples."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python313-demosh-0.6.0-1.8.noarch.rpm"
RPM_HASH = "a3ed479b024f8568e0d105415dcd07b6272cc85bdb61e84cf403463e8d40d9ccd4061bae5fd704b6e8efb97709d3cc5876c789f7bbb384d79930684ec8dcb6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-demosh \
python3.13dist-demosh \
python313-demosh \
python3dist-demosh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-curses \
update-alternatives"

inherit rpm
