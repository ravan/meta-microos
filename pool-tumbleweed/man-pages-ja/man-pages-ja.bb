SUMMARY = "LDP Manual Pages (Japanese)"
DESCRIPTION = "These are the Japanese man pages of the Linux Documentation Project. \
Note that they are normally older than the English versions.  For \
reference, you should use the English versions."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-4-Clause & GPL-2.0-only & GPL-2.0-or-later & GFDL-1.1-only & GFDL-1.2-only & GFDL-1.3-only"

PV = "20260815"

RPM_NAME = "man-pages-ja-20260815-1.1.noarch.rpm"
RPM_HASH = "c05773ba680c1f53e321a4282657a388a0fa9f1d08e64546720aec587fdb8577d3c0253a80609e89b50b5c8903bd29eab5d9bd9e924a5d45fafdec45bbb6ac81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-ja \
man-pages-ja"

RDEPENDS:${PN} += ""

inherit rpm
