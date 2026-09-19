SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python313-multipledispatch-1.0.0-2.5.noarch.rpm"
RPM_HASH = "b959608f28f65c45c6a94bc46af877a88dd383ba13d2b9273c1eac2f302a0fbfe294965b93d5e28d3138285a723cff487bdf3a04427752f968f54923e7ebf45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multipledispatch \
python3.13dist-multipledispatch \
python313-multipledispatch \
python3dist-multipledispatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
