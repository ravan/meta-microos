SUMMARY = "Python log in json format"
DESCRIPTION = "A formatter for python logging that outputs json log"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python313-jsonformatter-0.3.4-1.8.noarch.rpm"
RPM_HASH = "f354bbc3e2ac9906f40450bf6b6ba80a707d705e414385d60fd3cdbafd0b71cdb327dac31dcbe75de3712e0e54e845a152f402cbaf0f9a8a193226c8881c73cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonformatter \
python3.13dist-jsonformatter \
python313-jsonformatter \
python3dist-jsonformatter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
