SUMMARY = "SQL databases in Python, designed for simplicity, compatibility, and robustness"
DESCRIPTION = "SQLModel is a library for interacting with SQL databases from Python code, \
with Python objects. It is designed to be intuitive, easy to use, highly \
compatible, and robust. SQLModel is based on Python type annotations, and \
powered by Pydantic and SQLAlchemy."
LICENSE = "MIT"

PV = "0.0.39"

RPM_NAME = "python314-sqlmodel-0.0.39-1.1.noarch.rpm"
RPM_HASH = "980be570147a400351b3f0efd6ccd16a4d0a9c20174b31f2fb8d9552aba0d22cf6c8b5cf236e7bc5da963910ec0f7552f93a722c8c2ad4157c48720393eb1bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlmodel \
python314-sqlmodel \
python3dist-sqlmodel"

RDEPENDS:${PN} += "python-abi \
python314-SQLAlchemy \
python314-pydantic"

inherit rpm
