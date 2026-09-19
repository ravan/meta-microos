SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "12.2.3"

RPM_NAME = "python314-mitmproxy-12.2.3-1.2.noarch.rpm"
RPM_HASH = "671d2cfc01039cd03560bb4400320b34cea0fe7f7e5f3a522871b1cbc9e68e2e152ca4e837b0319c3c6df0edc1e82a9bedccd9ca977d8207bcd20646040f84c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mitmproxy \
python314-mitmproxy \
python3dist-mitmproxy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Brotli \
python314-Flask \
python314-aioquic \
python314-argon2-cffi \
python314-asgiref \
python314-bcrypt \
python314-certifi \
python314-cryptography \
python314-h11 \
python314-h2 \
python314-hyperframe \
python314-kaitaistruct \
python314-ldap3 \
python314-mitmproxy-rs \
python314-msgpack \
python314-publicsuffix2 \
python314-pyOpenSSL \
python314-pyparsing \
python314-pyperclip \
python314-ruamel.yaml \
python314-sortedcontainers \
python314-tornado \
python314-urwid \
python314-wsproto \
python314-zstandard"

inherit rpm
