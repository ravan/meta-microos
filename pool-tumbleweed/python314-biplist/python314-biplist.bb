SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python314-biplist-1.0.3-5.10.noarch.rpm"
RPM_HASH = "d3b705a05408f30eb0b2962b3dc545b8a04b5f4243f60b770b1168229fb535296bfb7a74da92d6dacacfd53c8a69efb412a927c53dae06eaf4ec01a9a0071517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-biplist \
python314-biplist \
python3dist-biplist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
