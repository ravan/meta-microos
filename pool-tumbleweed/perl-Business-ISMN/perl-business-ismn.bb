SUMMARY = "Work with International Standard Music Numbers"
DESCRIPTION = "work with International Standard Music Numbers"
LICENSE = "Artistic-2.0"

PV = "1.205.0"

RPM_NAME = "perl-Business-ISMN-1.205.0-1.7.noarch.rpm"
RPM_HASH = "f6577d9ddfe0b9b2c3dd07ce01581818a8a81779545b086399d605e9f2a2f97ca87943cbe3a920d6408ad85c37371690881f35d7b8d7dd4790050a81233da394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISMN \
perl-Business--ISMN--Data \
perl-Business-ISMN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Tie--Cycle"

inherit rpm
