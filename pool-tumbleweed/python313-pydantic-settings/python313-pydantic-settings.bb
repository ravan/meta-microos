SUMMARY = "Settings management using Pydantic"
DESCRIPTION = "Settings management using Pydantic, this is the new official home of Pydantic's `BaseSettings`."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "python313-pydantic-settings-2.14.2-2.1.noarch.rpm"
RPM_HASH = "1b9c8676f9c7f179032c85e5e0d69824701cbf3c58c21a079a2ab1f302f99e7251cd75b93dac2edc0f15fb6ab199470093e043f122fb48a9e24d16c6ab16df43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydantic-settings \
python3.13dist-pydantic-settings \
python313-pydantic-settings \
python3dist-pydantic-settings"

RDEPENDS:${PN} += "python-abi \
python313-pydantic \
python313-python-dotenv \
python313-typing-inspection"

inherit rpm
