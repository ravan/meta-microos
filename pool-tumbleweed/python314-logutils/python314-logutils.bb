SUMMARY = "Logging utilities"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python314-logutils-0.3.5-7.9.noarch.rpm"
RPM_HASH = "1d4a4324841acf4924a455fb900db55c9bcbc403f21ab8be7cc286faa8492b2ef5bd030a7574ea7c42e6f3ebacdef595a833cc96c54593f1334481fc53961d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-logutils \
python314-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
