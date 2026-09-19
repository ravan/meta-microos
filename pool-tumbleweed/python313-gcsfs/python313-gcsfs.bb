SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2026.5.0"

RPM_NAME = "python313-gcsfs-2026.5.0-1.2.noarch.rpm"
RPM_HASH = "28cf68801dc799476295a91e2f29a8c49ecf1ee7989e6061486665d8b27379cd1a803ebaaaa6b1e9b7874cf73a83ba866d894057c144624ab9f5e3bff02f981f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gcsfs \
python3.13dist-gcsfs \
python313-gcsfs \
python3dist-gcsfs"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-decorator \
python313-fsspec \
python313-google-auth \
python313-google-auth-oauthlib \
python313-google-cloud-storage \
python313-google-cloud-storage-control \
python313-requests"

inherit rpm
