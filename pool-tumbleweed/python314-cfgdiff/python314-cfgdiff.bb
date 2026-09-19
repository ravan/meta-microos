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

RPM_NAME = "python314-cfgdiff-0.0.0+git.1641843506.dc1234a-3.6.noarch.rpm"
RPM_HASH = "a99be8378d5e2165891d37815ae19ebec627acaf135614e0b54f56e979ebf2e0b41a3ad9dced87e33634b8894951ce6312fba81748a47895e60c55b38d499b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3.14dist-cfgdiff \
python314-cfgdiff \
python3dist-cfgdiff"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
