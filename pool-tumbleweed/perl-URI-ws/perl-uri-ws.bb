SUMMARY = "WebSocket support for URI package"
DESCRIPTION = "After this module is installed, the URI package provides the same set of \
methods for WebSocket URIs as it does for HTTP ones. For secure WebSockets, \
see URI::wss."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-URI-ws-0.03-1.27.noarch.rpm"
RPM_HASH = "9d749e8966697a9c4ae98c15978cfb679aab412cb5cdc29e98cda8fa24cdc9b4ac3361fb3d8270b7457a3d97610535cce5e7ab771965e47b0b603ca01204c5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--ws \
perl-URI--wss \
perl-URI-ws"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI"

inherit rpm
