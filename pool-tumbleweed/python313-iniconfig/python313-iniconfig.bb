SUMMARY = "iniconfig: brain-dead simple config-ini parsing"
DESCRIPTION = "iniconfig is a small and simple INI-file parser module \
having a unique set of features: \
 \
* tested against Python2.4 across to Python3.2, Jython, PyPy \
* maintains order of sections and entries \
* supports multi-line values with or without line-continuations \
* supports '#' comments everywhere \
* raises errors with proper line-numbers \
* no bells and whistles like automatic substitutions \
* iniconfig raises an Error if two sections have the same name."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-iniconfig-2.3.0-1.5.noarch.rpm"
RPM_HASH = "22b53f73f85339cd1d0f85a6db1f441ab0a560baa20685ef914417ed27689b33ba4e907a3081d581041ec1e3ede5f4b856b1fcccee0907fef0caded342024073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniconfig \
python3.13dist-iniconfig \
python313-iniconfig \
python3dist-iniconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
