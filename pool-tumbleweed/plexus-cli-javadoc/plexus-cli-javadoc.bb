SUMMARY = "Javadoc for plexus-cli"
DESCRIPTION = "Javadoc for plexus-cli."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "plexus-cli-javadoc-1.7-1.8.noarch.rpm"
RPM_HASH = "e9bf2fb5868479037704df6c8f8ec371ecc169c9a4a3b7c3056a57443f31e9326f30057b5d198dd660e2c3c31177726979a1639a0b35eae964e4435352ea6849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-cli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
