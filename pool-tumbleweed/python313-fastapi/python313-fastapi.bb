SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.138.0"

RPM_NAME = "python313-fastapi-0.138.0-2.1.noarch.rpm"
RPM_HASH = "c0b2be50b5b4c5839132332f291bb73cf89b880db153cd4871af575b6a1e60b3f8166f13efa05512deabe1f52b7d3e30f33b0bc5fca22c76eb8f1a68f94d9536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastapi \
python3.13dist-fastapi \
python313-fastapi \
python3dist-fastapi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-annotated-doc \
python313-base \
python313-pydantic \
python313-starlette \
python313-typing-extensions \
python313-typing-inspection"

inherit rpm
