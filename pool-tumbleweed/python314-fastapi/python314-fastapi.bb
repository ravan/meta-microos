SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.138.0"

RPM_NAME = "python314-fastapi-0.138.0-2.1.noarch.rpm"
RPM_HASH = "eada6785127fb14a1a56295ba5b9e74a860463ecd12eb3c3ab620c776e1c02bb186e28107509324f7096c5cf0b922586548a8d19bc45895bff7d04979bf2916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fastapi \
python314-fastapi \
python3dist-fastapi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-annotated-doc \
python314-base \
python314-pydantic \
python314-starlette \
python314-typing-extensions \
python314-typing-inspection"

inherit rpm
