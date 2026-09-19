SUMMARY = "Settings management using Pydantic"
DESCRIPTION = "Settings management using Pydantic, this is the new official home of Pydantic's `BaseSettings`."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "python314-pydantic-settings-2.14.2-2.1.noarch.rpm"
RPM_HASH = "d51fb8f29303775024a042b07aaa7625165297ebe0b9d8df9d1c36ac346adc710143e6544b8628aa9dd1844a82ee12f1d44a95ee3c8a080e570fae6374acf87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydantic-settings \
python314-pydantic-settings \
python3dist-pydantic-settings"

RDEPENDS:${PN} += "python-abi \
python314-pydantic \
python314-python-dotenv \
python314-typing-inspection"

inherit rpm
