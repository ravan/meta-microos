SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2026.7.0"

RPM_NAME = "python313-fsspec-2026.7.0-1.1.noarch.rpm"
RPM_HASH = "415ca37ce475c5eb58f8d6b2ec60a1e988b9949d748f83b31534efd8609858548ec21217d2c9add9ca1e177217325210da83c815a7235a27812becf84583ac40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fsspec \
python3.13dist-fsspec \
python313-fsspec \
python3dist-fsspec"

RDEPENDS:${PN} += "fuse \
python-abi"

inherit rpm
