SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-luadns-5.8.0-1.1.noarch.rpm"
RPM_HASH = "fe60577b5c67bb27c4a63b1832b783c73c6fbdef1c2dea5ef57e11d94e55727e945fc8c5175167604120627a273ff6953a2da41956008a3f55538c1343a90bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-luadns \
python3.13dist-certbot-dns-luadns \
python313-certbot-dns-luadns \
python3dist-certbot-dns-luadns"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dns-lexicon"

inherit rpm
