SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python314-requests-toolbelt-1.0.0-2.5.noarch.rpm"
RPM_HASH = "b293cd7f82574758ae6b943b35569581a6aa750410becdfbd68545ec69f4970b798ba2eeb28dd05694723a200e61f2db78d4a34660c9569449940162719ad215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-toolbelt \
python314-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
