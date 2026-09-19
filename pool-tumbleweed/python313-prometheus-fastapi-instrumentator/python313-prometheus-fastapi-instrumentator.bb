SUMMARY = "Instrument a FastAPI app with Prometheus metrics"
DESCRIPTION = "A configurable and modular Prometheus instrumentator for FastAPI and \
Starlette applications. It exposes request metrics such as latency, \
size and count, and lets you add custom metrics."
LICENSE = "ISC"

PV = "8.1.0"

RPM_NAME = "python313-prometheus-fastapi-instrumentator-8.1.0-1.1.noarch.rpm"
RPM_HASH = "647efc07d2e512719d5a133f85dfd176cb959bdd1d566cea03e2794c1a58233398a8e94255b604e761b1fb924af16f821d4d870f55e73921dabb3d0c3f25af7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prometheus-fastapi-instrumentator \
python3.13dist-prometheus-fastapi-instrumentator \
python313-prometheus-fastapi-instrumentator \
python3dist-prometheus-fastapi-instrumentator"

RDEPENDS:${PN} += "python-abi \
python313-prometheus-client \
python313-starlette"

inherit rpm
