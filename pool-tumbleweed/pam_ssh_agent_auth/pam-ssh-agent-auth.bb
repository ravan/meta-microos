SUMMARY = "Permits PAM authentication via your keyring in a forwarded ssh-agent"
DESCRIPTION = "pam_ssh_agent_auth is a PAM module which permits PAM \
authentication via your keyring in a forwarded ssh-agent. \
 \
20220111: using https://github.com/FlorianFranzen/pam_ssh_agent_auth, \
'just-one-big-cookie' branch so that ed25519 + Yubikey works."
LICENSE = "OpenSSL"

PV = "0.10.4"

RPM_NAME = "pam_ssh_agent_auth-0.10.4-3.8.aarch64.rpm"
RPM_HASH = "ed08e069a4fd0f78436b17aba0f983e08011a2581293900976f7a9b3ea2a1d0913f1380c308717d8d0a1cd92df0bb840e002272a218da10901e5c6b5b47e1184"

RPROVIDES:${PN} += "pam-ssh-agent-auth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpam.so.0"

inherit rpm
