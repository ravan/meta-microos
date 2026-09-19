SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "12.2.3"

RPM_NAME = "python313-mitmproxy-12.2.3-1.2.noarch.rpm"
RPM_HASH = "8d43553862b5f4053e06937d1d5fc714074cef0b989fd43d395b02bff7111449a732c4e33d42e1152da3d2d7a940666e46db897ab1f14ba69d0efefda1993dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mitmproxy \
python3.13dist-mitmproxy \
python313-mitmproxy \
python3dist-mitmproxy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Brotli \
python313-Flask \
python313-aioquic \
python313-argon2-cffi \
python313-asgiref \
python313-bcrypt \
python313-certifi \
python313-cryptography \
python313-h11 \
python313-h2 \
python313-hyperframe \
python313-kaitaistruct \
python313-ldap3 \
python313-mitmproxy-rs \
python313-msgpack \
python313-publicsuffix2 \
python313-pyOpenSSL \
python313-pyparsing \
python313-pyperclip \
python313-ruamel.yaml \
python313-sortedcontainers \
python313-tornado \
python313-urwid \
python313-wsproto \
python313-zstandard"

inherit rpm
