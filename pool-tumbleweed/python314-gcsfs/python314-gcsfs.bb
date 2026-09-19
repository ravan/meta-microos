SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2026.5.0"

RPM_NAME = "python314-gcsfs-2026.5.0-1.2.noarch.rpm"
RPM_HASH = "0f0ad8a24be6dc2450d9290574ddb6bef6b9b2686c3c39d5b1ab2f5123e6bc0f3d98fdd3dfa047766b03bee7d74107a6f9db479eecd7afb051c9dc7917a57b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gcsfs \
python314-gcsfs \
python3dist-gcsfs"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-decorator \
python314-fsspec \
python314-google-auth \
python314-google-auth-oauthlib \
python314-google-cloud-storage \
python314-google-cloud-storage-control \
python314-requests"

inherit rpm
