SUMMARY = "Japanese gothic-typeface fonts designed by Motoya"
DESCRIPTION = "This package provides a font family named 'MotoyaLCedar W3 mono'. \
It was provided to Android platform by Motoya."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "motoya-lcedar-fonts-1.0.0-11.25.noarch.rpm"
RPM_HASH = "62e0c3e6d2a756935fba6277dcacbf4dd4f7f9f0754b9c2ffbb9305cf15f90bc6da6157112ed10d3e6dbc306b684df3acf57c61ee25407b570d7785a1fd8e2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "motoya-lcedar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
