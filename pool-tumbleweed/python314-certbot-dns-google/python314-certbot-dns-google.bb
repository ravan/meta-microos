SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-google-5.8.0-1.1.noarch.rpm"
RPM_HASH = "4d259844f0e38eecbc2ab35c21c9decca59903920bcb2df478fcf16a15b6d144dd97b1c8c0b221b96144c05499f2f377092b85947c3dc3edd822a926cbd1e293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-google \
python314-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-google-api-python-client \
python314-google-auth"

inherit rpm
