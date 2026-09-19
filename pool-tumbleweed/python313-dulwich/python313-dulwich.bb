SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.2.14"

RPM_NAME = "python313-dulwich-1.2.14-1.1.aarch64.rpm"
RPM_HASH = "8a1958e601661a620ce668f2edbe64c2784e489bd1aea7c83ef17f825b887dcc6e8a419820c6b288ec0957322cdd13c5b6962c503134ed6dab359dd0bedf015f"

RPROVIDES:${PN} += "python3-dulwich \
python3.13dist-dulwich \
python313-dulwich \
python3dist-dulwich"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-urllib3"

inherit rpm
