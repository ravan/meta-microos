SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python314-libarchive-0.4.7-5.5.noarch.rpm"
RPM_HASH = "953327a2c6e1e3ea1ac48d715aa0e4aabfd0250f879d9062ba188c2cd9a93d628ff7d19f5c7e3bfe30821ce14b3e6a1886f153e881071d4cb9db7f9f076e1057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libarchive \
python314-libarchive \
python3dist-libarchive"

RDEPENDS:${PN} += "libarchive-devel \
python-abi"

inherit rpm
