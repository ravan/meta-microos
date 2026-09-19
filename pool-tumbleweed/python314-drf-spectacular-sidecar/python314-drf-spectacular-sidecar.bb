SUMMARY = "Serve self-contained distribution builds of Swagger UI and Redoc with Django"
DESCRIPTION = "Serve self-contained distribution builds of Swagger UI and Redoc with Django"
LICENSE = "BSD-3-Clause"

PV = "2026.8.1"

RPM_NAME = "python314-drf-spectacular-sidecar-2026.8.1-1.1.noarch.rpm"
RPM_HASH = "60ce1e6936874faebc5673085bb790a4cfe225286b8bcb05fab0cddf67f834f4577e348efa8919f16c26520a540c473d22c771fb788f28bd472679a0a0425990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-drf-spectacular-sidecar \
python314-drf-spectacular-sidecar \
python3dist-drf-spectacular-sidecar"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
