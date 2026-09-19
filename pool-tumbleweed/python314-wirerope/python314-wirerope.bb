SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python314-wirerope-1.0.0-2.2.noarch.rpm"
RPM_HASH = "c7c09c6c036d7fd136269dacacba99cbd4cdaa136f6ac7bb6149c00baad8816c27a6c1d43383832b9a942446dc29f602c324b95b4837a96becfdb2790ceeb8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wirerope \
python314-wirerope \
python3dist-wirerope"

RDEPENDS:${PN} += "python-abi"

inherit rpm
