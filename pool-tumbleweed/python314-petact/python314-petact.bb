SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-petact-0.1.2-5.5.noarch.rpm"
RPM_HASH = "bb44816cd418f64d37d8ef3f8167bca49cc12eb2d06e495d85f843b55f849d4581f2dd620c276f2133bf357e37d1ec3859102fd98d1ee14532e87eea187ccd7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-petact \
python314-petact \
python3dist-petact"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
