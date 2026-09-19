SUMMARY = "Hjson, a user interface for JSON"
DESCRIPTION = "Hjson, a user interface for JSON."
LICENSE = "MIT"

PV = "3.1.0+git.1762077481.9351a27"

RPM_NAME = "python314-hjson-3.1.0+git.1762077481.9351a27-2.2.noarch.rpm"
RPM_HASH = "071ef6a8c40c8ed9d99745efdf26e1a32dc5259feb7f7e5a6b4cb53249dce0eb5eb79c1e795f378579bdfc380f67ed91993d888b0bf1f5d9c60d1cfdc49dba9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hjson \
python314-hjson \
python3dist-hjson"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
