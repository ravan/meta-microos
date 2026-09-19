SUMMARY = "Update dynamic DNS records hosted by dns24.ch"
DESCRIPTION = "DNS24 (dns24.ch) is a DNS hosting service offering support for dynamic DNS. \
With this utility you can easily configure regular updates of your dynamic DNS \
records hosted by DNS24."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "dns24-update-1.1-1.18.noarch.rpm"
RPM_HASH = "e16f0c1772c17054210e9d846b22d11909113468cca5e0232dd71559fe0bfb7d6663e108950b8ffd1979656541867700bca092a485ee51cc56546d1176cda481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dns24-update \
dns24-update"

RDEPENDS:${PN} += "/usr/bin/sh \
curl"

inherit rpm
