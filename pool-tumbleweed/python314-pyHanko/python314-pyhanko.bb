SUMMARY = "Tools for stamping and signing PDF files"
DESCRIPTION = "The lack of open-source CLI tooling to handle digitally signing and stamping PDF files was bothering me, so I went ahead and rolled my own."
LICENSE = "MIT"

PV = "0.36.2"

RPM_NAME = "python314-pyHanko-0.36.2-1.1.noarch.rpm"
RPM_HASH = "771e1546f4a10735606b0263e7418e3674b2eb379ae155c67f5c1d9afde6a381fc9b9c2219ae52bdf4c40db86945e62e144e42dd2a97eac1952f680cc8194596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyhanko \
python314-pyHanko \
python314-pyhanko \
python3dist-pyhanko"

RDEPENDS:${PN} += "python-abi \
python314-asn1crypto \
python314-cryptography \
python314-lxml \
python314-pyhanko-certvalidator \
python314-requests \
python314-tzlocal \
update-alternatives"

inherit rpm
