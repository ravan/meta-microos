SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python313-iniparse-0.5-10.4.noarch.rpm"
RPM_HASH = "fe70f1d1d7d158bdadaf4787ecdce445b8db0f86b981d86810a84f427f3ee35606c50e2adc3a52391f8f17526ea985d93860716758a6657dd6fc5478781a526c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniparse \
python3.13dist-iniparse \
python313-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
