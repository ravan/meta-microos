SUMMARY = "Tools for stamping and signing PDF files"
DESCRIPTION = "The lack of open-source CLI tooling to handle digitally signing and stamping PDF files was bothering me, so I went ahead and rolled my own."
LICENSE = "MIT"

PV = "0.36.2"

RPM_NAME = "python313-pyHanko-0.36.2-1.1.noarch.rpm"
RPM_HASH = "3b8d5b6be1e5ef7477623c9b4cc1a89afa3f0a376791c2abf1aea98955f5e930cf2bbcc826005add5358ef97b06bb60eb895db537087866c244c8949a875d0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyHanko \
python3-pyhanko \
python3.13dist-pyhanko \
python313-pyHanko \
python313-pyhanko \
python3dist-pyhanko"

RDEPENDS:${PN} += "python-abi \
python313-asn1crypto \
python313-cryptography \
python313-lxml \
python313-pyhanko-certvalidator \
python313-requests \
python313-tzlocal \
update-alternatives"

inherit rpm
