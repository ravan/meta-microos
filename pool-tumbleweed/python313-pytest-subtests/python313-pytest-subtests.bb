SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python313-pytest-subtests-0.15.0-1.2.noarch.rpm"
RPM_HASH = "6a4b5fb73b93bbe3fda0724a27ff430ae2420c6b4af9339a00622065e2e6d61301d9af5036658f6b5ecc99a91f03db4826e387c15b5dbe07cc5a7cf6aea7cc40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subtests \
python3.13dist-pytest-subtests \
python313-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-pytest"

inherit rpm
