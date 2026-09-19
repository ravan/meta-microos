SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "4.1.1"

RPM_NAME = "python313-Markups-4.1.1-1.5.noarch.rpm"
RPM_HASH = "cb6e395ec20a6178f4b1bcd7621243e30699a58a067c31ed14457608e3f07a8313508c1e2f044754dd691064565fd4bf78637b3e74a464dbf63689e40de55d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markups \
python3.13dist-markups \
python313-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python313-python-markdown-math"

inherit rpm
