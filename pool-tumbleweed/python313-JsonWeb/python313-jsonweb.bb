SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python313-JsonWeb-0.8.2-7.5.noarch.rpm"
RPM_HASH = "f2dd9a664054732bf1307942fda491eb9056b45f01468cea0581b198d90729ba3efe5eca7c852e18355468083340881a22a1c6b2e189ca53236a5915f5ac6110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-JsonWeb \
python3.13dist-jsonweb \
python313-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
