SUMMARY = "Find outdated or deprecated Helm charts running in your cluster"
DESCRIPTION = "Nova scans your cluster for installed Helm charts, then cross-checks them against all known Helm repositories. If it finds an updated version of the chart you're using, or notices your current version is deprecated, it will let you know."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "nova-3.12.0-1.4.aarch64.rpm"
RPM_HASH = "2f6416b3db8c3ce9dc2b92c91404c04ad36da7a1d9a526937b99fc69a1ae48cfdd69bb7d85391a5266fed2635669d488351de759ddeed6f16b4ab44e9bb5f788"

RPROVIDES:${PN} += "nova"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
