SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-toolz-1.1.0-2.1.noarch.rpm"
RPM_HASH = "ee2d45e33cac4090fb51a3a8a989b334b8c1344d087c8dc9abbb09809d386628d0c0b75ea4151282d38aa40de995ba6035f78066a3456cef8e2fb3f351863846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toolz \
python3.13dist-toolz \
python313-toolz \
python3dist-toolz"

RDEPENDS:${PN} += "python-abi"

inherit rpm
