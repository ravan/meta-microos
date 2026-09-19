SUMMARY = "Tempora LGC Unicode Fonts (OpenType Format)"
DESCRIPTION = "Tempora LGC Unicode is a font family, designed to provide a free \
typeface suitable for word processing in languages which use 3 European \
alphabets: Latin, Greek and Cyrillic. It may be especially useful for \
philologists (mainly slavists and classicists), since it supports \
historical Cyrillic letters available in the Unicode standard (including \
letters used in Russian  pre-1918 orthography) as well as all accented \
combinations and additional characters needed for fully accented Greek \
(both classical and modern). Tempora LGC Unicode is a 'smart' font, \
intended to demonstrate nicities of the OpenType technologie, applicable \
to European scripts. \
 \
This package contains fonts in OpenType format."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.2.1"

RPM_NAME = "thessalonica-tempora-lgc-otf-fonts-0.2.1-11.26.noarch.rpm"
RPM_HASH = "563a5c95d07c0fbe5cca48a8a8f65a3947653cecac929765d26966ce440c6d022b2b827911119d90e18ad1d3a790eec238049daf737970dd5fd90e2b2f6193de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tempora-lgc-fonts-otf \
thessalonica-tempora-lgc-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
