SUMMARY = "Common translations for Firefox ESR"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox ESR."
LICENSE = "MPL-2.0"

PV = "153.2.0"

RPM_NAME = "firefox-esr-translations-common-153.2.0-1.1.aarch64.rpm"
RPM_HASH = "6a63c643685ae393f21ce8b604f758b3eedf780c8937af330b82c4aca388e2c799895005e4470320df1b8539b8cd5f75b037ff9ef5e23a31a275c98f29b66b6d"

RPROVIDES:${PN} += "firefox-esr-translations \
firefox-esr-translations-common \
locale-firefox-esr-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "firefox-esr"

inherit rpm
