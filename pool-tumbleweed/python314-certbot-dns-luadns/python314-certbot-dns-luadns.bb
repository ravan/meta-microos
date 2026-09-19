SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-luadns-5.8.0-1.1.noarch.rpm"
RPM_HASH = "8e9b429ca35b7cc87dbda078f0c32fb7a3035c3d05cafaafaa99c8856c86a2e0195b26258135deb54906ff79e376b9d3047a446ec1cc53989e1837e4a7d47565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-luadns \
python314-certbot-dns-luadns \
python3dist-certbot-dns-luadns"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dns-lexicon"

inherit rpm
