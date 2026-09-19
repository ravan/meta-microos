SUMMARY = "Fancy PyPI READMEs with Hatch"
DESCRIPTION = "hatch_fancy_pypi_readme is a Hatch metadata plugin for everyone who cares about \
the first impression of their project's PyPI landing page. It allows you to \
define your PyPI project description in terms of concatenated fragments that \
are based on static strings, files, and most importantly: parts of files \
defined using cut-off points or regular expressions. \
 \
Once you've assembled your readme, you can additionally run regular \
expression-based substitutions over it. For instance to make relative links \
absolute or to linkify users and issue numbers in your changelog. \
 \
Do you want your PyPI readme to be the project readme, but without badges, \
followed by the license file, and the changelog section for only the last \
release? You've come to the right place!"
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python314-hatch-fancy-pypi-readme-25.1.0-3.6.noarch.rpm"
RPM_HASH = "6a5ec52294d81bf472372aa2922b230b5f060ba78d9083f324bde1f13fbfca9109aa6005aa164dd223cf59d94dc1fa9ea0465ee79e3c02e890b3c926f83ae75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-fancy-pypi-readme \
python314-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python3.14dist-hatchling"

inherit rpm
