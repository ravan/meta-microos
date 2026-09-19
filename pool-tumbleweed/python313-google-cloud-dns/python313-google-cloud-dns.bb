SUMMARY = "Google Cloud DNS API access"
DESCRIPTION = "Cloud DNS API provides methods that you can use to manage DNS for your \
applications."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "python313-google-cloud-dns-0.37.0-1.1.noarch.rpm"
RPM_HASH = "561194c97601299940ff6b1d5fea22f11cbbef4ecb9c4b064d342d5e2adc77f71a21b74f8a0858546e29f503dd791423fadd2e53e555b2a9680492d832bef47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-dns \
python3.13dist-google-cloud-dns \
python313-google-cloud-dns \
python3dist-google-cloud-dns"

RDEPENDS:${PN} += "python-abi \
python313-google-cloud-core"

inherit rpm
