SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python314-tokenize-rt-6.2.0-1.3.noarch.rpm"
RPM_HASH = "f6b971ba46f6190dee97baa6d20ee41f5be5710d70a826cd992fad55f7e6e0379f9795a7eab027a99886c5e374f92e5c3729d191e4f62da2027b1146fa8eb1b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tokenize-rt \
python314-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
