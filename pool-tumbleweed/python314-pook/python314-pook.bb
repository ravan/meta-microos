SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "2.1.6"

RPM_NAME = "python314-pook-2.1.6-2.1.noarch.rpm"
RPM_HASH = "aec5313ca1ebbfba19ff9a0b4b54a3f6a14964e300443c37aad51aa70971e92e9620adcef35065aa655e22a83c62c23b68f0e8853be4b123a292eaba36363274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pook \
python314-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python314-furl \
python314-jsonschema \
python314-xmltodict"

inherit rpm
