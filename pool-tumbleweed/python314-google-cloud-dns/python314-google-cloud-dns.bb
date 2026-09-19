SUMMARY = "Google Cloud DNS API access"
DESCRIPTION = "Cloud DNS API provides methods that you can use to manage DNS for your \
applications."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "python314-google-cloud-dns-0.37.0-1.1.noarch.rpm"
RPM_HASH = "f8e92035a63827c5a14f7e00055bcd45e9b011ccc3ee49877259202863f8db752eb785b4ede10c0b3ccedbf00d41267e6811cdd2d81ce836723d4b21488ba5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-dns \
python314-google-cloud-dns \
python3dist-google-cloud-dns"

RDEPENDS:${PN} += "python-abi \
python314-google-cloud-core"

inherit rpm
