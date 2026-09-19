SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python314-mypy-protobuf-3.2.0-1.26.noarch.rpm"
RPM_HASH = "30ed8f60fe08b198998375d307d4a82fe60b410e6e816455190c5cf05f77af1a2394dc0447eaf9eda085776170212a9081852a21075cfe3062ba082b79a3cd7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mypy-protobuf \
python314-mypy-protobuf \
python3dist-mypy-protobuf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-protobuf \
update-alternatives"

inherit rpm
