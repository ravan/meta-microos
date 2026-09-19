SUMMARY = "Documentation and examples for python313-watchdog"
DESCRIPTION = "This package contains documentation and examples for python313-watchdog."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python313-watchdog-doc-6.0.0-3.5.noarch.rpm"
RPM_HASH = "ba47009bbdf4123c4de65ed84cfa088f845c59d1101270d4c40640daa53139ef14dbeb53aa05316d2f7d9f6aa3087ce579ed65bdc50aa939393ba7fa2a4af4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-watchdog-doc \
python313-watchdog-doc"

RDEPENDS:${PN} += ""

inherit rpm
