SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "4.1.1"

RPM_NAME = "python314-Markups-4.1.1-1.5.noarch.rpm"
RPM_HASH = "c4cb68c80ff08d2c48cebc309fc560daceb23fe063eee2176f77713d4f00bad9f3d04754e80be14871972204b8a4caad576bf127d718bcf85cfbc6e56f673635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markups \
python314-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python314-python-markdown-math"

inherit rpm
