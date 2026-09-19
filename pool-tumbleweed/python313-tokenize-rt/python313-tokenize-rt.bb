SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python313-tokenize-rt-6.2.0-1.3.noarch.rpm"
RPM_HASH = "3432a6ef32698ab65dca1ca4064e6db110b8c92a2c3394ddcef475ae3c217e076d2beb19e4541b0c5ceaa9ac00093fa46f204163e546fd352a97d07c7340ee1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tokenize-rt \
python3.13dist-tokenize-rt \
python313-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
