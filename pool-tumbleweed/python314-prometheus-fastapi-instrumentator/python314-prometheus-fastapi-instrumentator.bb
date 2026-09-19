SUMMARY = "Instrument a FastAPI app with Prometheus metrics"
DESCRIPTION = "A configurable and modular Prometheus instrumentator for FastAPI and \
Starlette applications. It exposes request metrics such as latency, \
size and count, and lets you add custom metrics."
LICENSE = "ISC"

PV = "8.1.0"

RPM_NAME = "python314-prometheus-fastapi-instrumentator-8.1.0-1.1.noarch.rpm"
RPM_HASH = "f10dca59c87fbfc4e19e7e359b00a9918ce4a0cb7fe6e46e62b2486bac9b998b872aee96dc812983887d5ea0150e9a201cf1c7888116c0d0bad35e6e17118c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-prometheus-fastapi-instrumentator \
python314-prometheus-fastapi-instrumentator \
python3dist-prometheus-fastapi-instrumentator"

RDEPENDS:${PN} += "python-abi \
python314-prometheus-client \
python314-starlette"

inherit rpm
