SUMMARY = "MATE Office"
DESCRIPTION = "MATE Office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_office_opt-20170319-6.3.aarch64.rpm"
RPM_HASH = "71d10b32bca5cb9b49c81cab8ff8dfe685bfbb22294037c39f1aef64410e95b416eb246c5b30a0ddab8e7c5ed1c7ac733b12b3cadc860f34615874cc24eabaa4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-office-opt"

RDEPENDS:${PN} += "pattern-"

inherit rpm
