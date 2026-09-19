SUMMARY = "Tempora LGC Unicode Fonts (TrueType Format)"
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
This package contains fonts in TrueType format."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.2.1"

RPM_NAME = "thessalonica-tempora-lgc-ttf-fonts-0.2.1-11.26.noarch.rpm"
RPM_HASH = "363cc7e1bdb5a119373b4c2049ef233a8fafae0436696a9398017be8ae4897cc03e7b51c48c0dd5fcfe8ae3f6e8bd2b664cf0c6381ff01672b0bd4b1804d4393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tempora-lgc-fonts-ttf \
thessalonica-tempora-lgc-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
