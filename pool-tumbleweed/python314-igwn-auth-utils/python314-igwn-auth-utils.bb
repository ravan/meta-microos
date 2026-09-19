SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python314-igwn-auth-utils-1.4.0-1.1.noarch.rpm"
RPM_HASH = "f99a5dff6a8c767df6cd16f872566583deed46e97689f573dbdb9adda81f95561c0cbe02f910fe40e430d48e51206342dc162a0d2d085e698798d3460e9b05a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-igwn-auth-utils \
python314-igwn-auth-utils \
python314-igwn-auth-utils-requests \
python3dist-igwn-auth-utils"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-requests \
python314-safe-netrc \
python314-scitokens"

inherit rpm
