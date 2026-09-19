SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.5.4"

RPM_NAME = "python314-mrcfile-1.5.4-3.1.noarch.rpm"
RPM_HASH = "8c841e2422620f5fd2110112041b54fba634f62c4143ad803cee2b6e03d844d7326096f8726e3bafe8454ddcbd6fec63126579a6abfe61ebae0aca13ad68b8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mrcfile \
python314-mrcfile \
python3dist-mrcfile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-numpy \
update-alternatives"

inherit rpm
