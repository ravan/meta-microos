SUMMARY = "A command line tool for managing LLDAP"
DESCRIPTION = "LLDAP-CLI is a command line interface for LLDAP. \
 \
LLDAP uses GraphQL to offer an HTTP-based API. This API is used by an included \
web-based user interface. Unfortunately, LLDAP lacks a command-line interface, \
which is a necessity for any serious administrator. LLDAP-CLI translates CLI \
commands to GraphQL API calls."
LICENSE = "GPL-3.0"

PV = "0.0.1~1724618445.6eb61ce"

RPM_NAME = "lldap-cli-0.0.1~1724618445.6eb61ce-1.6.noarch.rpm"
RPM_HASH = "f8e83ddc8955278bb633ffcfa05026abac21c9da204804971b1bc1f001ba953436efee0d8b8a421b29d5b6d183e390b57d27171a7ea6a4d90cb58dab2566642a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lldap-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
coreutils \
curl \
grep \
jq \
lldap-set-password \
sed"

inherit rpm
