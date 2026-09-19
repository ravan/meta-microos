SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python313-pyipp-0.17.2-1.4.noarch.rpm"
RPM_HASH = "fb58cda7dd1910e09923b618777b508f29c6b8cae5044cd4ab169ab280222c7256cf5f94f97dc97433e86928361644661cc6303b724e25db977435e8ebd5b4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyipp \
python3.13dist-pyipp \
python313-pyipp \
python3dist-pyipp"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-awesomeversion \
python313-backoff \
python313-deepmerge \
python313-yarl"

inherit rpm
