SUMMARY = "Communications server for Jabber/XMPP"
DESCRIPTION = "Prosody is a communications server for Jabber/XMPP written in Lua. \
 \
Prosody can link up with other Prosody installations and other \
XMPP-compatible services to form an open communication network, \
whilst allowing control over who they connect to, and who they share \
data with."
LICENSE = "MIT"

PV = "13.0.6"

RPM_NAME = "prosody-13.0.6-1.3.aarch64.rpm"
RPM_HASH = "75ccdf793e39176dfdcc52c41a60b65f6b12d636295ba57b88cea3c0908931ecea6991f87647e5def5f1d496be2e10b296b6474e7c295a69da1dcdad853412ff"

RPROVIDES:${PN} += "config-prosody \
group-prosody \
prosody \
user-prosody"

RDEPENDS:${PN} += "/usr/bin/lua5.4 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libicui18n.so.78 \
libicuuc.so.78 \
lua54 \
lua54-luaexpat \
lua54-luafilesystem \
lua54-luasec \
lua54-luasocket \
lua54-readline \
permissions \
shadow \
systemd"

inherit rpm
