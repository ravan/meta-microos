SUMMARY = "TLP Power Profiles Daemon"
DESCRIPTION = "Power Profiles Daemon replacement for TLP."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-pd-1.10.2-1.1.noarch.rpm"
RPM_HASH = "62ffed1bd6f36a63bc335920f292a1cd2288e7c20bf03a2f737feb359c673a3e3053218493bc9dde50e7f74803dcc13dad5671df9a79cd678c506fda8faac33d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-pd"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
systemd \
tlp"

inherit rpm
