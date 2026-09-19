SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python313-wirerope-1.0.0-2.2.noarch.rpm"
RPM_HASH = "32138998b4a290d2f86aa301d9c76f9b10324e7e64df63f7b3777769d5fbdbe82dcacdd4de1d601e7ad892b015ec308cc2c084a2cfb0653a5ecdb68d8028a215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wirerope \
python3.13dist-wirerope \
python313-wirerope \
python3dist-wirerope"

RDEPENDS:${PN} += "python-abi"

inherit rpm
