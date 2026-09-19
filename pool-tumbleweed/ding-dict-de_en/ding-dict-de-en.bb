SUMMARY = "German<->English word dictionary in DING syntax"
DESCRIPTION = "This package contains the German<->English dictionary/wordlist from \
TU Chemnitz in an easy markup language suitable for use with grep. \
A recommended graphical frontend for using this dictionary is 'ding'."
LICENSE = "GPL-2.0-or-later"

PV = "1.9"

RPM_NAME = "ding-dict-de_en-1.9-3.9.noarch.rpm"
RPM_HASH = "665c796948d6ae92ebf45e3c563592e4ba9ad1c47868c3a93b0676d1a3200a2f671b83bee6abe12b1f61105f73ba0cf5789dfe7baac93923d989bfb6d77ccc48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ding-dict-de-en"

RDEPENDS:${PN} += ""

inherit rpm
