SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-config-7.14.3-1.1.noarch.rpm"
RPM_HASH = "28741cd4ebef9e6e60522a60eb463da05c3c998e0bc06cf5987eee6e94f5367ec50f1857a4a7efbf9e1e94fd989798dcfc470774a66667d83f088c6b3bc4aba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"

RDEPENDS:${PN} += "group-tss \
python3-keylime \
user-keylime"

inherit rpm
