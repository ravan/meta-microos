SUMMARY = "HTML parser based on the WHATWG HTML specification"
DESCRIPTION = "**A tiny HTML5 parser** \
 \
tinyhtml5 is a HTML5 parser that transforms a possibly malformed HTML document \
into an ElementTree tree. \
 \
This module is a simplified fork of html5lib, written and maintained by James \
Graham, Sam Sneddon, Łukasz Langa and Will Kahn-Greene. \
 \
* Free software: MIT license \
* For Python 3.9+, tested on CPython and PyPy \
* Documentation: https://doc.courtbouillon.org/tinyhtml5 \
* Changelog: https://github.com/CourtBouillon/tinyhtml5/releases \
* Code, issues, tests: https://github.com/CourtBouillon/tinyhtml5 \
* Code of conduct: https://www.courtbouillon.org/code-of-conduct \
* Professional support: https://www.courtbouillon.org \
* Donation: https://opencollective.com/courtbouillon \
 \
Copyrights are retained by their contributors, no copyright assignment is \
required to contribute to tinyhtml5. Unless explicitly stated otherwise, any \
contribution intentionally submitted for inclusion is licensed under the MIT \
license, without any additional terms or conditions. For full authorship \
information, see the version control history."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-tinyhtml5-2.1.0-2.2.noarch.rpm"
RPM_HASH = "930c4488728a0b6d85456a892fcf19ceccb1bc7321474d574575b21186d494b7461592bb67a71ea946a835a89b821d52e97f43b964cbf78371e81df0fdb4607d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tinyhtml5 \
python314-tinyhtml5 \
python3dist-tinyhtml5"

RDEPENDS:${PN} += "python-abi \
python314-webencodings"

inherit rpm
