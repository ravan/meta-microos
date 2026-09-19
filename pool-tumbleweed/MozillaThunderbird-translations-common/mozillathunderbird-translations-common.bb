SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "140.15.0"

RPM_NAME = "MozillaThunderbird-translations-common-140.15.0-1.1.aarch64.rpm"
RPM_HASH = "7dffa3b69b1d5100b91beb0fdc984031038d615c6de3d46ecd2eaea893f1ee232a23c153aa25fb508770e93bb89d1a7509bfd708ad097455a5b7e5cfee6d6e9e"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common \
locale-MozillaThunderbird-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
