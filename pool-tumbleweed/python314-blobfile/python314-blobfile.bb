SUMMARY = "Read GCS, ABS and local paths with the same interface"
DESCRIPTION = "A Python library that provides an open()-like interface for reading \
local and remote files (Google Cloud Storage and Azure Blob Storage), \
plus os.path- and shutil-like helpers that also accept GCS (gs://) \
and Azure (az://) paths. Inspired by TensorFlow's gfile, but not an \
exact clone of that API."
LICENSE = "Unlicense"

PV = "3.3.0"

RPM_NAME = "python314-blobfile-3.3.0-1.1.noarch.rpm"
RPM_HASH = "2eb07c90ce7ca0718816b9fe53d783829966180bb1c2bec4b4729d3d6061925ae71582c4dd086f923f24c6b653a0ea213f778e1fa7a9ec97afe840e600c37f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blobfile \
python314-blobfile \
python3dist-blobfile"

RDEPENDS:${PN} += "python-abi \
python314-filelock \
python314-lxml \
python314-pycryptodomex \
python314-urllib3"

inherit rpm
