SUMMARY = "Reusable constraint types to use with typing.Annotated"
DESCRIPTION = "PEP-593 added `typing.Annotated` as a way of adding context-specific metadata to \
existing types, and specifies that `Annotated[T, x]` _should_ be treated as `T` by \
any tool or library without special logic for `x`. \
 \
This package provides metadata objects which can be used to represent common \
constraints such as upper and lower bounds on scalar values and collection sizes, \
a `Predicate` marker for runtime checks, and \
descriptions of how we intend these metadata to be interpreted. In some cases, \
we also note alternative representations which do not require this package."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python314-annotated-types-0.8.0-1.1.noarch.rpm"
RPM_HASH = "5178f1bc2652e08d514e9c52d485fdcb8e5b3947b471043592b2bf1a642a35ef7416295a2ad0d273e15bbeffde9d0cfbb514abbcd2a04a8839800ee654d5e2f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-annotated-types \
python314-annotated-types \
python3dist-annotated-types"

RDEPENDS:${PN} += "python-abi"

inherit rpm
