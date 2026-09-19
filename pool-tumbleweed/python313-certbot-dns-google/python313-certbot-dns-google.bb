SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-google-5.8.0-1.1.noarch.rpm"
RPM_HASH = "5000a2ae0772a3dbe2d91937bb0b6443ff4da71c7f3d1c6a90fd617c95ef6445fd877a51fd4bd546859c6082f79064d1955e7767fbd85579a34047ab489713e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-google \
python3.13dist-certbot-dns-google \
python313-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-google-api-python-client \
python313-google-auth"

inherit rpm
