SUMMARY = "Japanese Round-Gothic-Typeface Fonts Designed by Motoya"
DESCRIPTION = "This package provides a font family named 'MotoyaLMaru W3 mono'. \
It was provided to Android platform by Motoya."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "motoya-lmaru-fonts-1.0.0-11.25.noarch.rpm"
RPM_HASH = "9021a7010515178bd0b92285f034980d68dde7b4e5b1a08b406160a42fb09b04e79279b5043e9b08aa7ab01c0508ae526c7d184a4677e1dbb4ea17513fe1fbbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "motoya-lmaru-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
