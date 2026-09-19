SUMMARY = "Serve self-contained distribution builds of Swagger UI and Redoc with Django"
DESCRIPTION = "Serve self-contained distribution builds of Swagger UI and Redoc with Django"
LICENSE = "BSD-3-Clause"

PV = "2026.8.1"

RPM_NAME = "python313-drf-spectacular-sidecar-2026.8.1-1.1.noarch.rpm"
RPM_HASH = "efdbb4ee8f1c08dc249ba366d5029cd8b971e11f7103c2ab10129899a97673277745ff3a9405d5292737bb2efcbce88ef14d1a8b6816e47d776858fc6d60de17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-drf-spectacular-sidecar \
python3.13dist-drf-spectacular-sidecar \
python313-drf-spectacular-sidecar \
python3dist-drf-spectacular-sidecar"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
