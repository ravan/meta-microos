SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.3"

RPM_NAME = "python313-Durus-4.3-2.7.aarch64.rpm"
RPM_HASH = "e82a60f64303a52a01b3191623fef6f86d203a76e97d34433edd233dea514a5a56b5a4fbf264c78fbf60c2232e92b6b6f38eaf7f0a6ad0f3d96c9222518d9bc4"

RPROVIDES:${PN} += "python3-Durus \
python3.13dist-durus \
python313-Durus \
python3dist-durus"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
