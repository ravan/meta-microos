SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.20"

RPM_NAME = "python313-fasteners-0.20-1.4.noarch.rpm"
RPM_HASH = "2972225166172a76441b328016dd61dc0573eb77af59c6a2707d5f9024907ba40bfdd5eb83710f018551507970b9355ef2a9788751b25232920704bdbee9d284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fasteners \
python3.13dist-fasteners \
python313-fasteners \
python3dist-fasteners"

RDEPENDS:${PN} += "python-abi \
python313-more-itertools"

inherit rpm
