SUMMARY = "Advanced Enumerations, NamedTuples, and NamedConstants"
DESCRIPTION = "Advanced Enumerations (compatible with Python's stdlib Enum), \
NamedTuples, and NamedConstants \
 \
AEnum includes a Python stdlib Enum-compatible data type, as well as \
a metaclass-based NamedTuple implementation and a NamedConstant \
class. \
 \
An Enum is a set of symbolic names (members) bound to unique, \
constant values. Within an enumeration, the members can be compared \
by identity, and the enumeration itself can be iterated over.  If \
using Python 3 there is built-in support for unique values, multiple \
values, auto-numbering, and suspension of aliasing (members with the \
same value are not identical), plus the ability to have values \
automatically bound to attributes. \
 \
A NamedTuple is a class-based, fixed-length tuple with a name for \
each possible position accessible using attribute-access notation as \
well as the standard index notation. \
 \
A NamedConstant is a class whose members cannot be rebound; it lacks \
all other Enum capabilities, however; consequently, it can have \
duplicate values."
LICENSE = "BSD-3-Clause"

PV = "3.1.16"

RPM_NAME = "python314-aenum-3.1.16-1.2.noarch.rpm"
RPM_HASH = "32f1789bc936a52d8682ce3caa252561ed8003a989599263ab4020fdb404003d8312e9db1a64131922a73993fd3da581e9bfb7a868e7635a47f8b16d0989de68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aenum \
python314-aenum \
python3dist-aenum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
