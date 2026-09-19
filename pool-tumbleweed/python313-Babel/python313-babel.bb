SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.18.0"

RPM_NAME = "python313-Babel-2.18.0-1.4.noarch.rpm"
RPM_HASH = "44a56aef9eaf36d75670b752be3e6a6b80dfbd8714c43a2c495184c16bedbc0daa65023414b83a5a50302a2cbd3e2e21ea8792136fe117e34da8578c4ad96a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Babel \
python3-babel \
python3.13dist-babel \
python313-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-tzdata"

inherit rpm
