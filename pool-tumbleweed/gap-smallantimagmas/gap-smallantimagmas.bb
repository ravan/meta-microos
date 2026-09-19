SUMMARY = "GAP: A library of antiassociative magmas of small order"
DESCRIPTION = "The smallantimagmas package classifies all finite, antiassociative magmas."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gap-smallantimagmas-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "f3c139373b028695b6f464ce354347ba3e87dddc215ffa2ce30858648f72eda94d99cb565b341b0a9683ada18c809c540ca4824f7c7461463bc559538c4f2b49"

RPROVIDES:${PN} += "gap-smallantimagmas"

RDEPENDS:${PN} += "gap-core \
gap-digraphs \
gap-gapdoc"

inherit rpm
