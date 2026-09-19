SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "24.11.0"

RPM_NAME = "python313-incremental-24.11.0-1.3.noarch.rpm"
RPM_HASH = "763cc6070ad7397728be800684bde6b74c10687a2f16e587aefa61b0b35baab88b53b5fba8d257618f4d8ca8b174e39cc8b2935f64bbbc6b6e091c7a7110c0db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-incremental \
python3.13dist-incremental \
python313-incremental \
python3dist-incremental"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
