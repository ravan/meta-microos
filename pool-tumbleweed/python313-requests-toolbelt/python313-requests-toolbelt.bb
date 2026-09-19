SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python313-requests-toolbelt-1.0.0-2.5.noarch.rpm"
RPM_HASH = "e8402f7d321a9bdbc11f1e566434535bc9bbb8bbd1af3fa7a1ac42f21304d0d5f01ee43ce70e85f7b82b87822e2c5d30a16367e1f91dde96e65a0d4a2062c9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-toolbelt \
python3.13dist-requests-toolbelt \
python313-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
