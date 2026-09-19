SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python313-methodtools-0.4.7-2.5.noarch.rpm"
RPM_HASH = "d76671574f5d592ee08c93726eff32e02faa2f08c51250ab78f115e08f388921e8d6b3af85475a77094ae78741221913e51f37bc44138cd62d70aa796392fdc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-methodtools \
python3.13dist-methodtools \
python313-methodtools \
python3dist-methodtools"

RDEPENDS:${PN} += "python-abi \
python313-wirerope"

inherit rpm
