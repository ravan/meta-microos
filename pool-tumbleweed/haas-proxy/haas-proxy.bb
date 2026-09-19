SUMMARY = "Man in the middle proxy for honeypot as a service"
DESCRIPTION = "HaaS proxy application forwards incoming traffic from port 22 (commonly used \
for SSH) to the HaaS server, where Cowrie honeypot simulates a device and \
records executed commands."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "haas-proxy-1.9-2.3.noarch.rpm"
RPM_HASH = "5b7665ea5185ba78a478d4920d750a735d4b48ab95a15315c10f611dbed7d86577fe09af9a99831fcea460b51afd5a39c4a0f975efc14c3837e589b2ac5e9526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-haas-proxy \
haas-proxy \
python3.13dist-haas-proxy \
python3dist-haas-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-Twisted \
python3-cachetools \
python3-requests \
sshpass \
systemd"

inherit rpm
