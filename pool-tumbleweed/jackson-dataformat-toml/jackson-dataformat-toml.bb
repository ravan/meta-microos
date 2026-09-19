SUMMARY = "Support for reading and writing TOML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing TOML encoded data. \
This project adds necessary abstractions on top to make things work \
with other Jackson functionality."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-toml-2.18.9-1.1.noarch.rpm"
RPM_HASH = "efae2958bad41a9d239049b62a8ed8a6db33ced89a8743d2c363165b87df3625e0184b95bc5210c55cc7118772d9238a797c1a5f0239bbf9a46e7aa82ab65c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-toml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-toml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-toml-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-toml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
