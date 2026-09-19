SUMMARY = "Python IDE based on Qt6"
DESCRIPTION = "Eric is a Python and Ruby editor and IDE, written in Python. It is \
based on the Qt GUI toolkit and integrates the Scintilla editor \
control."
LICENSE = "GPL-3.0-or-later"

PV = "25.3"

RPM_NAME = "eric-25.3-2.4.noarch.rpm"
RPM_HASH = "c5fdba92ff47771177c415ea2b76d80b003827edf0b3b24136e9ce96f7885889650a0bbeb276162cf8aaf8e0570ec5bc3506313bb116d15e059459f2a5c9afd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eric \
eric5 \
eric6 \
python-eric5 \
python-eric6"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-EditorConfig \
python3-Pygments \
python3-asttokens \
python3-black \
python3-coverage \
python3-isort \
python3-jedi \
python3-packaging \
python3-parso \
python3-qscintilla-qt6 \
python3-qt6 \
python3-qtcharts-qt6 \
python3-qtwebengine-qt6 \
python3-semver \
python3-tomlkit \
python3-trove-classifiers \
python3-xml \
qt6-sql-sqlite"

inherit rpm
