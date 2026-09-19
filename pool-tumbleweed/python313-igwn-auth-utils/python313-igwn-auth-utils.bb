SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python313-igwn-auth-utils-1.4.0-1.1.noarch.rpm"
RPM_HASH = "bdc289a548fd8bd66ca3e0a10c3ba64aaa68fff56a0ca9a7a4047449dbe356f224bdb69de8226b89e4e19664182eaca39c6a8d67a8062a1264f956ce435c8acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-igwn-auth-utils \
python3-igwn-auth-utils-requests \
python3.13dist-igwn-auth-utils \
python313-igwn-auth-utils \
python313-igwn-auth-utils-requests \
python3dist-igwn-auth-utils"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-requests \
python313-safe-netrc \
python313-scitokens"

inherit rpm
