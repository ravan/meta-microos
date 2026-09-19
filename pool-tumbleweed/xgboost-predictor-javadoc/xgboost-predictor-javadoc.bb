SUMMARY = "Javadoc for xgboost-predictor"
DESCRIPTION = "Javadoc for xgboost-predictor"
LICENSE = "Apache-2.0"

PV = "0.3.20"

RPM_NAME = "xgboost-predictor-javadoc-0.3.20-1.4.noarch.rpm"
RPM_HASH = "d25fc630ef39f4ec72a53d0774248ec77ef6eb788a7dd63ced27cff9489d755eb413cc0c1a645f6c14a2dc88be7cbc4d855a7dcd7a326547d33163fd7f9e1b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xgboost-predictor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
