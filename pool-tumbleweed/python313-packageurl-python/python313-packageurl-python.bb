SUMMARY = "A 'purl' aka package URL parser and builder"
DESCRIPTION = "A 'purl' aka. package URL parser and builder."
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python313-packageurl-python-0.17.6-1.2.noarch.rpm"
RPM_HASH = "95082e876146b7000eb6ccef28fea8717e3c83ea41f464f0da133905df2f2192dd636613e0178dbb3e91d73f307fde557c7541b5a92bc073f3dabf908845bd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-packageurl-python \
python3.13dist-packageurl-python \
python313-packageurl-python \
python3dist-packageurl-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
