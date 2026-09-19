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

RPM_NAME = "python313-hatch-fancy-pypi-readme-25.1.0-3.6.noarch.rpm"
RPM_HASH = "2df411cfd8e5d4a14b91f4fb4e1e86456b05f534453bbf942d53276aaaedf3fecca1ec470e8e443e1ea4fb8b658b1870d42a1294323d09df71a95a2f194c03fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-fancy-pypi-readme \
python3.13dist-hatch-fancy-pypi-readme \
python313-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python3.13dist-hatchling"

inherit rpm
