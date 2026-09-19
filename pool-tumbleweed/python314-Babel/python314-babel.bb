SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.18.0"

RPM_NAME = "python314-Babel-2.18.0-1.4.noarch.rpm"
RPM_HASH = "fa0c205ba918ce83647db880553eacf4eba8b6bc50c1450cd4cf69aa81bc38f02173f9828efc573bfd252be9e259ebe93fd208dc634865246567a0847fd4db6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-babel \
python314-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-tzdata"

inherit rpm
