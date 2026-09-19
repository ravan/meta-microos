SUMMARY = "Apparmor profile for shadowsocks-libev"
DESCRIPTION = "This package adds the Apparmor profile to shadowsocks-libev"
LICENSE = "GPL-3.0-or-later"

PV = "3.3.6"

RPM_NAME = "shadowsocks-libev-apparmor-3.3.6-3.3.noarch.rpm"
RPM_HASH = "7b576b7a7e572a70916b0390a33451f2b37f528352b79c922ef9e606ac565e52b50a6a282d921a8ae8a8f2dccfda8f4417624871ae78e905076488a79f453184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shadowsocks-libev-apparmor \
shadowsocks-libev-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
shadowsocks-libev"

inherit rpm
