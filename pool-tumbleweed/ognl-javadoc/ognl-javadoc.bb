SUMMARY = "Javadoc for ognl"
DESCRIPTION = "This package contains the API documentation for ognl."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "ognl-javadoc-3.4.7-2.1.noarch.rpm"
RPM_HASH = "dc46bdd912e10047975cc1fe58e3829c02978ae2bcf6b9822f145aa16ddb4592f389144f78863987cc3d5800ff7103e6de21fe44513b4414fdcd7c705c81a488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ognl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
