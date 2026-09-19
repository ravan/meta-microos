SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.20"

RPM_NAME = "python314-fasteners-0.20-1.4.noarch.rpm"
RPM_HASH = "b426af549c65ee09aeaf84be89c1405585ff94596cbe1a0d841a0ef815a5ab2b5c4e755a799dc3b6a0d65d65db3d067690bdd0506b9604dcd33e756fab4cedf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fasteners \
python314-fasteners \
python3dist-fasteners"

RDEPENDS:${PN} += "python-abi \
python314-more-itertools"

inherit rpm
