SUMMARY = "Data manipulation toolbox similar to R data.frame"
DESCRIPTION = "Data manipulation toolbox similar to R data.frame. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.2.0"

RPM_NAME = "octave-forge-dataframe-1.2.0-1.28.noarch.rpm"
RPM_HASH = "9a95e12449b386fddfdbd72c7cebdd1ac20f5f69716c194ba0408f5d902a00e610e078326837d2ea0d71b0c98a05310095d180935b4501125be9ff0e29a478fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-dataframe"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
