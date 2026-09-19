SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.1.0"

RPM_NAME = "python314-pytest-base-url-2.1.0-1.11.noarch.rpm"
RPM_HASH = "a9e1593822f0412f6e181d7a9f1522ce91cb245aba06aa06e1c50dcf73ae5ae348c10cf1326c799d7528441af5d0c4c4068bbddea500e150352967c1df99ffbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-base-url \
python314-pytest-base-url \
python3dist-pytest-base-url"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-requests"

inherit rpm
