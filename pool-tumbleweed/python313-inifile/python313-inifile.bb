SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python313-inifile-0.4.1-2.5.noarch.rpm"
RPM_HASH = "8734e720ee9b93954922ffc2bec6c91514cad8dbfc2ab173b83bd64f3228ea82967ec76d75191edf7f899b18cf4415fe5c05e4807a190f7b04e3ac3d79ff14ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inifile \
python3.13dist-inifile \
python313-inifile \
python3dist-inifile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
