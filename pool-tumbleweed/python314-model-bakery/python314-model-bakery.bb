SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.23.4"

RPM_NAME = "python314-model-bakery-1.23.4-1.4.noarch.rpm"
RPM_HASH = "98cd5fb6545bdd1cfbf1cd3864c58bae8d579a7469698d380198035d29bc5930bb45d32fd579975a49cf647ede9e16d0bec11b53c6a0bf5809ee07efbccbe94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-model-bakery \
python314-model-bakery \
python3dist-model-bakery"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
