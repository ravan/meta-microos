SUMMARY = "Filesystem specification package"
DESCRIPTION = "A specification for pythonic filesystems."
LICENSE = "BSD-3-Clause"

PV = "2026.7.0"

RPM_NAME = "python314-fsspec-2026.7.0-1.1.noarch.rpm"
RPM_HASH = "888b4c0f48bf6b410e0d9bd3bd1d6db5374a09469ed282c49a988fd56b27239dac5c9ece0e7499754f28762bea75eff03c37aff21cfff62b585d81d67d697c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fsspec \
python314-fsspec \
python3dist-fsspec"

RDEPENDS:${PN} += "fuse \
python-abi"

inherit rpm
