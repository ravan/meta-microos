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

RPM_NAME = "python313-tinyhtml5-2.1.0-2.2.noarch.rpm"
RPM_HASH = "4dd778aad73a05945f75841dcfb925d16e67172af72f3b7fa679a7766e2a427f52b918b2cbc3d9bef514a5846c4fff7aa8db821bec38e37074578cb95055bc58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyhtml5 \
python3.13dist-tinyhtml5 \
python313-tinyhtml5 \
python3dist-tinyhtml5"

RDEPENDS:${PN} += "python-abi \
python313-webencodings"

inherit rpm
