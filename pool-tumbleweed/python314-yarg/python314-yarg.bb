SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python314-yarg-0.1.10-1.9.noarch.rpm"
RPM_HASH = "b33552812f619666536d9af7b1380a58c759bdd832f5081c292f211da5ceffb6c6e22c8d9e6f664c78803ebcf7ec57966c54b9d10b43c9771e7f746d33bc0b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yarg \
python314-yarg \
python3dist-yarg"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
