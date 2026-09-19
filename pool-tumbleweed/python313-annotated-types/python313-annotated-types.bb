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

RPM_NAME = "python313-annotated-types-0.8.0-1.1.noarch.rpm"
RPM_HASH = "ae074e150672ab7a28a456a5a077bf336d4d8cf4947cf28cae6fc53db373efe897d2a8f03342ecc2888a8f9b783fef894782674615c6401947d1a407452c5016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-annotated-types \
python3.13dist-annotated-types \
python313-annotated-types \
python3dist-annotated-types"

RDEPENDS:${PN} += "python-abi"

inherit rpm
