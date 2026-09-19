SUMMARY = "SQL databases in Python, designed for simplicity, compatibility, and robustness"
DESCRIPTION = "SQLModel is a library for interacting with SQL databases from Python code, \
with Python objects. It is designed to be intuitive, easy to use, highly \
compatible, and robust. SQLModel is based on Python type annotations, and \
powered by Pydantic and SQLAlchemy."
LICENSE = "MIT"

PV = "0.0.39"

RPM_NAME = "python313-sqlmodel-0.0.39-1.1.noarch.rpm"
RPM_HASH = "6b4cc9e8aaee98393f5b0f33d22b68440438f6fa9602425f4a89fc85f99a57c8060733a274df8686780a14bf398884c6b65326e6ad9c3742c6ee32d240b55a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlmodel \
python3.13dist-sqlmodel \
python313-sqlmodel \
python3dist-sqlmodel"

RDEPENDS:${PN} += "python-abi \
python313-SQLAlchemy \
python313-pydantic"

inherit rpm
