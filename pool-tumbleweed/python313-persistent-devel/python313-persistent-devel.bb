SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python313-persistent C module."
LICENSE = "ZPL-2.1"

PV = "6.8"

RPM_NAME = "python313-persistent-devel-6.8-1.1.aarch64.rpm"
RPM_HASH = "91ad877f8249635b222487fcea368be75b3315e9abe5d7eae15672ab19be665d9f85ad56ed3b424328310134b147acee444467176b881b02a2fc0e0952587fe5"

RPROVIDES:${PN} += "python3-persistent-devel \
python313-persistent-devel"

RDEPENDS:${PN} += "python313-devel \
python313-persistent"

inherit rpm
