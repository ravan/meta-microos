SUMMARY = "Subsonic media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to a Subsonic or Navidrome server. \
It needs the installation of the subsonic-connector (version 0.3.10b3) \
and py-sonic (version 1.0.2) Python modules (not packaged, use Pypi)."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-subsonic-1.9.17-1.5.noarch.rpm"
RPM_HASH = "d998daee3f25d624b24d371fe994d90ebb4ae0511b4cb15a64af929453f10d25e897fafe162b0a9801bc8772ca390aea9db10687bd2be364a4022bae9602be34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-subsonic"

RDEPENDS:${PN} += "/usr/bin/env \
upmpdcli"

inherit rpm
