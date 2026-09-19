SUMMARY = "A minimal low-level HTTP client"
DESCRIPTION = "The HTTP Core package provides a minimal low-level HTTP client, which does \
one thing only. Sending HTTP requests."
LICENSE = "BSD-3-Clause"

PV = "2.12.0"

RPM_NAME = "python314-httpcore2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "50b6aca4ba8618342699d5b140f2c455ef0e33b73769489e4a41cfe83fbd8cfb9637532e89a6e85aa72c4ebde0be92060fe31eef07b835c4b86ca4fe67fe6eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpcore2 \
python314-httpcore2 \
python3dist-httpcore2"

RDEPENDS:${PN} += "python-abi \
python314-h11 \
python314-truststore"

inherit rpm
