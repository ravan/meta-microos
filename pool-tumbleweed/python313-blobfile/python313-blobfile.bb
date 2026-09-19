SUMMARY = "Read GCS, ABS and local paths with the same interface"
DESCRIPTION = "A Python library that provides an open()-like interface for reading \
local and remote files (Google Cloud Storage and Azure Blob Storage), \
plus os.path- and shutil-like helpers that also accept GCS (gs://) \
and Azure (az://) paths. Inspired by TensorFlow's gfile, but not an \
exact clone of that API."
LICENSE = "Unlicense"

PV = "3.3.0"

RPM_NAME = "python313-blobfile-3.3.0-1.1.noarch.rpm"
RPM_HASH = "cbbf6aff90710100b0eb92bccfef805f1c9def9401af75097c7d3cf3dbcf13f98053fa2be5b65f927d6a865885c9296e7015bae43fd4b03a098531ae5986a115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blobfile \
python3.13dist-blobfile \
python313-blobfile \
python3dist-blobfile"

RDEPENDS:${PN} += "python-abi \
python313-filelock \
python313-lxml \
python313-pycryptodomex \
python313-urllib3"

inherit rpm
