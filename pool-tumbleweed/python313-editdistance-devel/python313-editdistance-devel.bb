SUMMARY = "Development files for python313-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python313-editdistance C module."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python313-editdistance-devel-0.8.1-1.4.aarch64.rpm"
RPM_HASH = "31c47b15a23d7e94e1322309fca6b42cd0608233179eb4bed6374a606e2feb2b20665b6e7a7bdd794eb3aab42c29b3129ea3e3c2baa183ae968a9ddd5e99eed6"

RPROVIDES:${PN} += "python3-editdistance-devel \
python313-editdistance-devel"

RDEPENDS:${PN} += "python313-base \
python313-editdistance"

inherit rpm
