SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "154.0"

RPM_NAME = "MozillaFirefox-translations-common-154.0-1.2.aarch64.rpm"
RPM_HASH = "4fe88aa709ef5edcd17712b8fe127c1f99122765b4d25b005f251fab2c486cb67bfa9ab5a0d8806d09b766161526009fa033a5e117a79af9a986d805b160cd75"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
