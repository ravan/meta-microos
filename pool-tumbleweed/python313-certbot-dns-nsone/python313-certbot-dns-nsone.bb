SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-nsone-5.8.0-1.1.noarch.rpm"
RPM_HASH = "f4713247249393c8981ce9d88eb8afe9e8ca0e6309f8f0510ab03172e9bebd340a5f887a4b109d89fb8b10b69b3ae07e8b0e7cb55d0b4e64bd54079a6bcd89cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-nsone \
python3.13dist-certbot-dns-nsone \
python313-certbot-dns-nsone \
python3dist-certbot-dns-nsone"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dns-lexicon"

inherit rpm
