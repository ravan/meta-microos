SUMMARY = "Automatic dependency generator for QML files and modules"
DESCRIPTION = "Automatic dependency generator for QML files and modules. \
If installed, rpm uses this to generate Requires of .qml files \
and Provides of QML modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "qml-autoreqprov-1.4.1-1.9.noarch.rpm"
RPM_HASH = "5f3dfa13d9bb5c27121d2bc2fa9b1ba33e5e56b6ce65226ca2db38d23c6ed784bcc9913386061b4604aed3418c805754b609fe9561d170415b21bb659c4d1047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qml-autoreqprov"

RDEPENDS:${PN} += "/usr/bin/bash \
jq \
rpm"

inherit rpm
