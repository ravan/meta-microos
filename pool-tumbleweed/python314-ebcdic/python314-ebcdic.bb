SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python314-ebcdic-1.1.1-4.5.noarch.rpm"
RPM_HASH = "3d4490d80c63419360592f63084f98c1a804019234c88e6ade5a563e17d2bff3f9eb526adee76fd0ee9ae814dc12e534e1278eb9d27d6d64bf3a519948c4e771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ebcdic \
python314-ebcdic \
python3dist-ebcdic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
