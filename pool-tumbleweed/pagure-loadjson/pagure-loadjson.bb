SUMMARY = "The loadjson service for pagure"
DESCRIPTION = "pagure-loadjson is the service allowing to update the database with the \
information provided in the JSON blobs that are stored in the tickets (and \
in the future pull-requests) git repo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-loadjson-5.14.1-3.3.noarch.rpm"
RPM_HASH = "6f1cf8486385718bb9d6a147ee6886eb1b090e6b17580179b33733c8fb25705de1da117f93a107f6eefa66938cb1e397ef8514f3ce37f2d97678285ac2a36872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-loadjson"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm
