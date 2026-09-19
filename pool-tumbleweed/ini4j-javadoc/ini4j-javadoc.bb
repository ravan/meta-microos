SUMMARY = "Java API for handling Windows ini file format"
DESCRIPTION = "The [ini4j] is a simple Java API for handling configuration files in \
Windows .ini format. Additionally, the library includes Java \
Preferences API implementation based on the .ini file."
LICENSE = "Apache-2.0"

PV = "0.5.4"

RPM_NAME = "ini4j-javadoc-0.5.4-1.9.noarch.rpm"
RPM_HASH = "85738ac1a4fa2b6d7a37bbfd90978fb4232e0942ccdb70b8c7440551164d276c5e0b10f993687ba9cf7770081d254f20457558edb89ac565d43509dc44859048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ini4j-javadoc"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
javapackages-filesystem"

inherit rpm
