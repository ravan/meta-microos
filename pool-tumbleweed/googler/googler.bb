SUMMARY = "Google Search, Google Site Search, Google News from the terminal"
DESCRIPTION = "googler is a power tool to Google (Web & News) and Google Site Search \
from the command-line. It shows the title, URL and abstract for each \
result, which can be directly opened in a browser from the terminal. \
Results are fetched in pages (with page navigation). Supports \
sequential searches in a single googler instance."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.13"

RPM_NAME = "googler-4.3.13-1.9.noarch.rpm"
RPM_HASH = "f74d4ceeac13fb51f6be340ecef4215ff89b87c9d8f5230d36133a6bba50f2c92744fa5ae9d73e1f69dc836fd1e81ee43e427d2ed6134ba9b44849e3804e48a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "googler"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
