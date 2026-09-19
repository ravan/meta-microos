SUMMARY = "Documentation for qt6-speech in HTML format"
DESCRIPTION = "This package contains documentation for qt6-speech in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-speech-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3a14593c6d95b1363d66982eee29657c87820edddfd795a894185aafa8f0d590df37a53890f69dc5fef10ef273dd0c72dc1b69b69cc05f1dddd508b132ac0c78"

RPROVIDES:${PN} += "qt6-speech-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
