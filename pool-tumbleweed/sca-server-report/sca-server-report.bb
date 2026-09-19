SUMMARY = "Supportconfig Analysis Server Report"
DESCRIPTION = "A tool that primarily analyzes the local server, but can analyze other \
supportconfigs that have been copied to the server. It uses the \
Supportconfig Analysis patterns to perform the analysis. \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.6.5"

RPM_NAME = "sca-server-report-1.6.5-1.4.noarch.rpm"
RPM_HASH = "4a20b7fcfb1cad82d5cea532889e5c4e0dce86cf17c34feed3a0dccb0dcb2085e502bfd45f627546bff46c5979eb021085fe14da0c13de57380693e6411e4b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sca-server-report \
sca-server-report"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base \
sca-patterns-base \
sca-patterns-template-gen2"

inherit rpm
