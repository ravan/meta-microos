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

RPM_NAME = "python314-iniconfig-2.3.0-1.5.noarch.rpm"
RPM_HASH = "08299ef4de827058e7587378d37b322df345fe3758e94d4fb52840ab6d6c5a68fa5a46887899e84d049b57fb349ad44d5793eeceef919fa9927ab594d479b7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-iniconfig \
python314-iniconfig \
python3dist-iniconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
