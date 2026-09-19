SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python314-pytest-dotenv-0.5.2-2.5.noarch.rpm"
RPM_HASH = "c553a4afdf85197d94600215a5b27f0a80446071470dfe9f086ca00daf511cd655d136fc84a9d1969570c8ac1ec856e5d2f0059ecdfff2ab6f86a72e8f4303b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-dotenv \
python314-pytest-dotenv \
python3dist-pytest-dotenv"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-python-dotenv"

inherit rpm
