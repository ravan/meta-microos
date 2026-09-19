SUMMARY = "Persistent, Functional, Immutable data structures"
DESCRIPTION = "Pyrsistent is a number of persistent collections \
(by some referred to as functional data structures). \
Persistent in  the sense that they are immutable. \
 \
All methods on a data structure that would normally \
mutate it instead return a new copy of the structure \
containing the requested updates. The original structure \
is left untouched."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-pyrsistent-0.20.0-3.11.aarch64.rpm"
RPM_HASH = "c04e8c285ca21b7c8a8d7dfbacd41aaac85dc1a93a8da5ca42548b4648f18241903561799d28b9768d48896c788e3ac5c7c8123f908d8629bf0dfbb3026eeddd"

RPROVIDES:${PN} += "python3.14dist-pyrsistent \
python314-pyrsistent \
python3dist-pyrsistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
