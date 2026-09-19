SUMMARY = "Javadoc for jakarta-commons-validator"
DESCRIPTION = "A common issue when receiving data either electronically or from user \
input is verifying the integrity of the data. This work is repetitive \
and becomes even more complicated when different sets of validation \
rules need to be applied to the same set of data based on locale for \
example. Error messages may also vary by locale. This package attempts \
to address some of these issues and speed development and maintenance \
of validation rules. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Validator Package."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "apache-commons-validator-javadoc-1.10.1-1.2.noarch.rpm"
RPM_HASH = "9ea8eb0cc7833e2fccfad87ab525a3d5f5f4bb00fcb5b7cf4ed8a00edf615a77e9b3d4f5e2940227f3e2c04f0481c6ad352d81163d3c74fdf80fc4cba3ee6b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-validator-javadoc"

RDEPENDS:${PN} += "coreutils \
javapackages-filesystem"

inherit rpm
