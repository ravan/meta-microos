SUMMARY = "Setup Prometheus, Thanos & friends across multiple clusters"
DESCRIPTION = "Krius is a cli tool to setup and manage Prometheus, Thanos & friends across multiple clusters easily for scale"
LICENSE = "Apache-2.0"

PV = "0.1.1"

RPM_NAME = "krius-0.1.1-1.19.aarch64.rpm"
RPM_HASH = "467d84c9c0114ddfa025c5c005471b8f05a49ae687cde1a38cd350472c25a8a8f795a0e3b062d42fe9f0260bf2ef30b4125dcfad7604731fe51c45dbf1795f36"

RPROVIDES:${PN} += "krius"

RDEPENDS:${PN} += ""

inherit rpm
