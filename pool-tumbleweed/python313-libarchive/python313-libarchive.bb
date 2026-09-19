SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python313-libarchive-0.4.7-5.5.noarch.rpm"
RPM_HASH = "1d57bc147e78d9b3594747d765f496184a30659d95cbe79fdfce0a772dd4df3d1528c4a05d6881fad9bcd5f8520978886cc9015a5bcd7c4e3e065bfb4cdcb6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libarchive \
python3.13dist-libarchive \
python313-libarchive \
python3dist-libarchive"

RDEPENDS:${PN} += "libarchive-devel \
python-abi"

inherit rpm
