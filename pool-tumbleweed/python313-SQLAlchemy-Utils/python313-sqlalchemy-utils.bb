SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.42.1"

RPM_NAME = "python313-SQLAlchemy-Utils-0.42.1-1.3.noarch.rpm"
RPM_HASH = "ffe20f8b828753f7a1314180b189adbb8eb0b8b32b15cdd8f323b717bd44c98f2491514d1a098fc9b792ffcc0ab226fc83bd33c19e548d0d8a6d6baf42f958a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SQLAlchemy-Utils \
python3.13dist-sqlalchemy-utils \
python313-SQLAlchemy-Utils \
python3dist-sqlalchemy-utils"

RDEPENDS:${PN} += "python-abi \
python313-SQLAlchemy"

inherit rpm
