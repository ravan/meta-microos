SUMMARY = "Cfgdiff -- diff(1) all your configuration files"
DESCRIPTION = "cfgdiff will try to parse your configuration files, fetching all \
the relevant keys and values from them and then pretty-printing \
them in the original format. \
These results are then diffed and the diff is shown to you. \
 \
cfgdiff currently supports the following formats: \
 - INI using Python's ConfigParser library \
 - JSON using Python's JSON library \
 - YAML if the Python YAML library is installed \
 - XML if the Python lxml library is installed"
LICENSE = "MIT"

PV = "0.0.0+git.1641843506.dc1234a"

RPM_NAME = "python313-cfgdiff-0.0.0+git.1641843506.dc1234a-3.6.noarch.rpm"
RPM_HASH = "c4f15894fe3fb1d9be673b2879d4988adc10d82e90341130d3ebd6ecfc0fc725d9470d35a7cd719117abb0de23fe086766a6c864a8b4c764d2844a87e9a3a7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3-cfgdiff \
python3.13dist-cfgdiff \
python313-cfgdiff \
python3dist-cfgdiff"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
