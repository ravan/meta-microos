SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.3"

RPM_NAME = "python314-Durus-4.3-2.7.aarch64.rpm"
RPM_HASH = "3997a7645f260854823b73deeb508341166360cc2a3190935f8b49820ddc54bf6376255ee79a547d1e6fd08aa600e916c295d56344e3fe9b3484976bd034be5d"

RPROVIDES:${PN} += "python3.14dist-durus \
python314-Durus \
python3dist-durus"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
