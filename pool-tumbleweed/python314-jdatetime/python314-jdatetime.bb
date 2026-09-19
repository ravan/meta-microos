SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "5.2.0"

RPM_NAME = "python314-jdatetime-5.2.0-2.2.noarch.rpm"
RPM_HASH = "e933bec2951f6b5e34100c894bdd726d74fb7825e614a52c320e4cdbd22c796ee4a66d3c950345a6fbfe8c0829acbbe219f1bd9444fc1fed886af5f845794784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jdatetime \
python314-jdatetime \
python3dist-jdatetime"

RDEPENDS:${PN} += "python-abi \
python314-jalali-core"

inherit rpm
