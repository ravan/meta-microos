SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "python313-daiquiri-3.4.0-1.2.noarch.rpm"
RPM_HASH = "c577c8d8f9ad271570f14d6b2a099721548dcece015a036d96387d8198521e878071cf1d061c0d677e20346641c3a86651bfb98c9cec3b2718dcfa79057ac659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-daiquiri \
python3.13dist-daiquiri \
python313-daiquiri \
python3dist-daiquiri"

RDEPENDS:${PN} += "python-abi \
python313-python-json-logger"

inherit rpm
